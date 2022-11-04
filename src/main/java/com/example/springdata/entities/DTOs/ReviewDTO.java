package com.example.springdata.entities.DTOs;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class ReviewDTO {
    private Long id;
    private String comment;
    @JsonIgnore
    private UserDTO user;
    @JsonIgnore
    private ProductDTO product;
}
