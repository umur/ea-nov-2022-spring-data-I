package com.example.spring_data.dto;


import lombok.Data;

@Data
public class ProductDto {
    private Integer id;
    private String name;
    private double price;
    private String rating;
    private CategoryDto category;
}
