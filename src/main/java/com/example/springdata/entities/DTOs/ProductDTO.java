package com.example.springdata.entities.DTOs;

import com.example.springdata.entities.Category;
import com.example.springdata.entities.Review;
import lombok.Data;
import java.util.List;

@Data
public class ProductDTO {
    private Long id;
    private String name;
    private double price;
    private double rating;
    private Category category;
}
