package com.adu.api.controller;

import com.adu.api.model.BaseModel;
import com.adu.api.service.BaseModelService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/basemodel")
@RequiredArgsConstructor
@Tag(name = "Base Model Management", description = "APIs for managing base model")
public class BaseModelController {

    private final BaseModelService basemodelService;

    @GetMapping
    @Operation(summary = "Get all base models")
    public Flux<BaseModel> getAllBaseModel() {
        return basemodelService.getAllBaseModel();
    }

    @GetMapping("/{basemodel_id}")
    @Operation(summary = "Get base model by ID")
    public Mono<BaseModel> getBaseModelById(@PathVariable Long basemodel_id) {
        return basemodelService.getBaseModelById(basemodel_id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "Create a new base model")
    public Mono<BaseModel> createBaseModel(@RequestBody BaseModel basemodel) {
        return basemodelService.createBaseModel(basemodel);
    }

    @PutMapping("/{basemodel_id}")
    @Operation(summary = "Update an existing base model")
    public Mono<BaseModel> updateBaseModel(@PathVariable Long basemodel_id, @RequestBody BaseModel basemodel) {
        return basemodelService.updateBaseModel(basemodel_id, basemodel);
    }

    @DeleteMapping("/{basemodel_id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @Operation(summary = "Delete a base model")
    public Mono<Void> deleteBaseModel(@PathVariable Long basemodel_id) {
        return basemodelService.deleteBaseModel(basemodel_id);
    }
}
