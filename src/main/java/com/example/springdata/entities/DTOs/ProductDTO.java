package com.example.springdata.entities.DTOs;

import lombok.Data;

import java.util.List;

@Data
public class ProductDTO {
    private Long id;
    private String name;
    private double price;
    private double rating;
    private CategoryDTO category;
    private List<ReviewDTO> reviews;
}
