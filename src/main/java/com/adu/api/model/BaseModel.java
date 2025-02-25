package com.adu.api.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("base_model")
public class BaseModel  {

    @Id
    private Long base_model_id;
    private String description;
    private int bedroom_count;
    private int bath_count;
    private int square_feet;
    private float price;
    private LocalDateTime updated_at;
    private LocalDateTime created_at;


}
