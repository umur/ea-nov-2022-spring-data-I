package com.example.springdata.services;

import com.example.springdata.entities.DTOs.AddressDTO;
import com.example.springdata.entities.DTOs.CategoryDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {
    public CategoryDTO create(CategoryDTO categoryDTO);

    public List<CategoryDTO> getAll();

    public CategoryDTO update(Long id, CategoryDTO categoryDTO);

    public String delete(Long id);
}
