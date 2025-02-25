package com.adu.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.ReactiveAuditorAware;
import org.springframework.data.r2dbc.config.EnableR2dbcAuditing;
import reactor.core.publisher.Mono;

/**
 * Configuration class to enable Spring Data R2DBC auditing.
 */
@Configuration
@EnableR2dbcAuditing
public class R2dbcConfig {

    @Bean
    public ReactiveAuditorAware<String> auditorAware() {
        // In real usage, you might integrate with the security context:
        // return () -> ReactiveSecurityContextHolder.getContext()
        //       .map(ctx -> ctx.getAuthentication().getName());
        return () -> Mono.just("system");
    }
}
