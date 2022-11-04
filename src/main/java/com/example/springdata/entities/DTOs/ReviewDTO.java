package com.example.springdata.entities.DTOs;

import com.example.springdata.entities.Product;
import com.example.springdata.entities.User;
import lombok.Data;

@Data
public class ReviewDTO {
    private Long id;
    private String comment;
}
