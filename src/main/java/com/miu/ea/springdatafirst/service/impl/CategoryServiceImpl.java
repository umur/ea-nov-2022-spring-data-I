package com.miu.ea.springdatafirst.service.impl;

import com.miu.ea.springdatafirst.entity.Category;
import com.miu.ea.springdatafirst.repository.CategoryRepository;
import com.miu.ea.springdatafirst.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private CategoryRepository categoryRepository;

    @Override
    public void addCategory(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public List<Category> getAllCategory() {
        return categoryRepository.findAll();
    }

    @Override
    public Category getById(Long id) {
        return categoryRepository.findById(id).get();
    }

    @Override
    public void updateCategory(Long id, Category category) {
        Category categoryToUpdate = getById(id);
        categoryToUpdate = category;
        categoryRepository.save(category);
    }

    @Override
    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }
}
