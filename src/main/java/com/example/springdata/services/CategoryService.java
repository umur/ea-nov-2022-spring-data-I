package com.example.springdata.services;

import com.example.springdata.entities.DTOs.CategoryDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {
    public CategoryDTO create(CategoryDTO categoryDTO);

    public List<CategoryDTO> getAll();

    public CategoryDTO find(Long id);

    public CategoryDTO update(Long id, CategoryDTO categoryDTO);

    public CategoryDTO delete(Long id);
}
