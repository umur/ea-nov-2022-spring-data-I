package com.example.springdata.services.impl;

import com.example.springdata.entities.Category;
import com.example.springdata.entities.DTOs.CategoryDTO;
import com.example.springdata.repositories.CategoryRepo;
import com.example.springdata.services.CategoryService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryRepo categoryRepo;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public CategoryDTO create(CategoryDTO categoryDTO) {
        Category category = modelMapper.map(categoryDTO, Category.class);
        return modelMapper.map(categoryRepo.save(category), CategoryDTO.class);
    }

    @Override
    public List<CategoryDTO> getAll() {
        return categoryRepo.findAll().stream().map(c -> modelMapper.map(c, CategoryDTO.class)).collect(Collectors.toList());
    }

    @Override
    public CategoryDTO find(Long id) {
        return modelMapper.map(categoryRepo.findById(id), CategoryDTO.class);
    }

    @Override
    public CategoryDTO update(Long id, CategoryDTO categoryDTO) {
        Category category = categoryRepo.findById(id).orElseThrow(()-> new RuntimeException("Category not found!!"));
        return modelMapper.map(categoryRepo.save(category), CategoryDTO.class);
    }

    @Override
    public CategoryDTO delete(Long id) {
        Category category = categoryRepo.findById(id).orElseThrow(()-> new RuntimeException("Category not found!!"));
        categoryRepo.delete(category);
        return modelMapper.map(category, CategoryDTO.class);
    }
}
