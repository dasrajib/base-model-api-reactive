package com.adu.api.config;

import com.adu.api.model.BaseEntity;
import org.springframework.data.r2dbc.mapping.event.BeforeConvertCallback;
import org.springframework.data.relational.core.sql.SqlIdentifier;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;
import org.springframework.security.core.context.ReactiveSecurityContextHolder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;

import java.time.LocalDateTime;

@Component
public class AuditingCallback implements BeforeConvertCallback<BaseEntity> {

    private Mono<String> getCurrentAuditor() {
        return ReactiveSecurityContextHolder.getContext()
            .map(SecurityContext::getAuthentication)
            .map(Authentication::getName)
            .defaultIfEmpty("system");
    }

    @Override
    public Mono<BaseEntity> onBeforeConvert(BaseEntity entity, SqlIdentifier table) {
        LocalDateTime now = LocalDateTime.now();
        return getCurrentAuditor().map(auditor -> {
            if (entity.getCreatedAt() == null) {
                // New entity: set createdAt and createdBy.
                entity.setCreatedAt(now);
                entity.setCreatedBy(auditor);
                // Do not modify updatedAt/updatedBy (leave them null)
            } else {
                // For an existing entity, only update updatedAt/updatedBy if they've been set already.
                // This prevents the case where the callback runs again on a freshly inserted entity.
                if (entity.getUpdatedAt() != null) {
                    entity.setUpdatedAt(now);
                    if (entity.getUpdatedBy() == null) {
                        entity.setUpdatedBy(auditor);
                    }
                }
            }
            return entity;
        });
    }
}
