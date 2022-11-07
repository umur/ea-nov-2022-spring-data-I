package com.example.spring_data.service;

import com.example.spring_data.dto.CategoryDto;

import java.util.List;

public interface ICategoryService {
    List<CategoryDto> findAll ();

    CategoryDto findCategoryById (Integer id);

    void create (CategoryDto categoryDto);

    void delete (Integer id);

    void update(Integer id,String name);
}
