package com.example.springdataI.dto;

import com.example.springdataI.entity.Category;
import com.example.springdataI.entity.Review;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import java.util.List;
@Data
public class ProductDto {
    private Integer id;
    private String name;
    private double price;
    private String rating;

    private CategoryDto category;

}
