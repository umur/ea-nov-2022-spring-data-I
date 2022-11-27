package com.lab3.lab3.controller;

import com.lab3.lab3.entity.Category;
import com.lab3.lab3.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @PostMapping
    public String addCategory(@RequestBody Category category){
        return categoryService.addCategory(category);
    }

    @GetMapping("/{id}")
    public Category getCategoryById(@PathVariable long id){

        return categoryService.findCategoryById(id);
    }


    @DeleteMapping("/{id}")
    public String deleteCategory(@PathVariable long id){
        return categoryService.DeleteCategory(id);
    }

    @GetMapping
    public List<Category> allCategories(){
        return categoryService.categories();
    }


}
