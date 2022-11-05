package com.example.springdataI.dto;

import com.example.springdataI.entity.Product;
import com.example.springdataI.entity.Users;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

@Data
public class ReviewDto {
    private Integer id;
    private String comment;

    private ProductDto product;

    private UsersDto user;
}
