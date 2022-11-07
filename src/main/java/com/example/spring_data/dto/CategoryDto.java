package com.example.spring_data.dto;


import lombok.Data;

import java.util.List;

@Data
public class CategoryDto {
    private Integer id;
    private String name;

    private List<ProductDto> products;
}