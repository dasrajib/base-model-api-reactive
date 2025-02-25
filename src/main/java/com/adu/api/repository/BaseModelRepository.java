package com.adu.api.repository;

import com.adu.api.model.BaseModel;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BaseModelRepository extends ReactiveCrudRepository<BaseModel, Long> {

    Flux<BaseModel> findByDescription(String description);    
}
