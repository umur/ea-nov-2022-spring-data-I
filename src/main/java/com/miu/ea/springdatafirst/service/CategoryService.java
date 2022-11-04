package com.miu.ea.springdatafirst.service;

import com.miu.ea.springdatafirst.entity.Category;

import java.util.List;

public interface CategoryService {
    void addCategory(Category category);

    List<Category> getAllCategory();

    Category getById(Long id);

    void updateCategory(Long id, Category category);

    void deleteCategory(Long id);
}
