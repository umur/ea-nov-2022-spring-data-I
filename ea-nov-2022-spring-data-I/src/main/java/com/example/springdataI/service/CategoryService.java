package com.example.springdataI.service;

import com.example.springdataI.dto.CategoryDto;
import com.example.springdataI.entity.Category;

import java.util.List;

public interface CategoryService {
    public List <CategoryDto> findAll ();

    public CategoryDto findCategoryById (Integer id);

    void create (CategoryDto categoryDto);

    void delete (Integer id);

    void update(Integer id,String name);
}
