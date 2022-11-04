package com.example.springdata.entities.DTOs;

import com.example.springdata.entities.Product;
import lombok.Data;

import javax.persistence.OneToMany;
import java.util.List;

@Data
public class CategoryDTO {
    private Long id;
    private String name;
}
