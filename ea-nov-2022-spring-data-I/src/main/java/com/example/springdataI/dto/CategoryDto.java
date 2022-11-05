package com.example.springdataI.dto;

import com.example.springdataI.entity.Product;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import java.util.List;
@Data
public class CategoryDto {
    private Integer id;
    private String name;

    private List <ProductDto> products;
}
