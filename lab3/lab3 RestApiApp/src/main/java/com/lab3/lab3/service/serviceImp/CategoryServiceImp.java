package com.lab3.lab3.service.serviceImp;

import com.lab3.lab3.entity.Category;
import com.lab3.lab3.repository.CategoryRepo;
import com.lab3.lab3.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImp implements CategoryService {
    @Autowired
    private CategoryRepo categoryRepo;
    @Override
    public String addCategory(Category category) {
        categoryRepo.save(category);
        return "category " + category.getName() + "saved successfully";
    }

    @Override
    public String DeleteCategory(long id) {
        categoryRepo.deleteById(id);
        return "category deleted successfully";
    }

    @Override
    public List<Category> categories() {
        List<Category> categories=new ArrayList<>();
        categoryRepo.findAll().forEach(categories::add);
        return categories;
    }

    @Override
    public Category findCategoryById(long id) {
        return categoryRepo.findById(id).get();
    }
}
