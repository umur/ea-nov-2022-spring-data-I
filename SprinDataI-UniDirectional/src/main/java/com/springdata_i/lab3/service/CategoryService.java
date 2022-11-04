package com.springdata_i.lab3.service;

import com.springdata_i.lab3.entity.Address;
import com.springdata_i.lab3.entity.Category;

public interface CategoryService {
    Category getCategory();
    Category addCategory(Category category);
    Category updateCategory(Category category);
    Category deleteCategory(Category category);
}
