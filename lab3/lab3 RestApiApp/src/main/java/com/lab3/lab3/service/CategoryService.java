package com.lab3.lab3.service;

import com.lab3.lab3.entity.Category;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CategoryService {

    String addCategory(Category category);
    String DeleteCategory(long id);
    List<Category> categories();
    Category findCategoryById(long id);
}
