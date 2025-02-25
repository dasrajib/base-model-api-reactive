package com.adu.api.service;

import com.adu.api.model.BaseModel;
import com.adu.api.repository.BaseModelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class BaseModelService {

    private final BaseModelRepository basemodelRepository;

    public Flux<BaseModel> getAllBaseModel() {
        return basemodelRepository.findAll();
    }

    public Mono<BaseModel> getBaseModelById(Long basemodel_id) {
        return basemodelRepository.findById(basemodel_id);
    }

    public Mono<BaseModel> createBaseModel(BaseModel basemodel) {
        return basemodelRepository.save(basemodel);
    }

    public Mono<BaseModel> updateBaseModel(Long basemodel_id, BaseModel basemodel) {
        return basemodelRepository.findById(basemodel_id)
                .flatMap(existingBaseModel -> {
                    existingBaseModel.setDescription(basemodel.getDescription());
                    existingBaseModel.setBedroom_count(basemodel.getBedroom_count());
                    existingBaseModel.setBath_count(basemodel.getBath_count());
                    existingBaseModel.setSquare_feet(basemodel.getSquare_feet());
                    existingBaseModel.setPrice(basemodel.getPrice());

                    existingBaseModel.setUpdated_at(LocalDateTime.now());
                
                    return basemodelRepository.save(existingBaseModel);
                });
    }

    public Mono<Void> deleteexistingBaseModel(Long basemodel_id) {
        return basemodelRepository.deleteById(basemodel_id);
    }
}
