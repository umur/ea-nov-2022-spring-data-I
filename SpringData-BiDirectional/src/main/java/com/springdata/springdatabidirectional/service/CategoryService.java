package com.springdata.springdatabidirectional.service;


import com.springdata.springdatabidirectional.entity.Address;
import com.springdata.springdatabidirectional.entity.Category;

import java.util.List;

public interface CategoryService {
    Category save(Category category);
    Category updateCategory(Category category);
    Category getById(Long id);
    void deleteCategory(Long id);
    List<Category> getAll();
}
