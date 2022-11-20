package com.miu.edu.spring.data.service.impl;

import com.miu.edu.spring.data.dto.CategoryDto;
import com.miu.edu.spring.data.repository.CategoryRepository;
import com.miu.edu.spring.data.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public List<CategoryDto> getAllCategories() {
        return categoryRepository.findAll().stream().map(CategoryDto::convertFrom).toList();
    }

    @Override
    public CategoryDto getCategoryById(int id) {
        return CategoryDto.convertFrom(categoryRepository.findById(id).orElse(null));
    }

    @Override
    public void updateCategory(int id, CategoryDto category) {
        categoryRepository.findById(id).ifPresent(c -> {
            c.setName(category.getName());
            categoryRepository.save(c);
        });
    }

    @Override
    public CategoryDto addCategory(CategoryDto categoryDto) {
        return CategoryDto.convertFrom(categoryRepository.save(CategoryDto.convertTo(categoryDto)));
    }

    @Override
    public void removeById(int id) {
        categoryRepository.deleteById(id);
    }
}
