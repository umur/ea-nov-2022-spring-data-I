package com.miu.ea.springdatafirst.controller;

import com.miu.ea.springdatafirst.entity.Category;
import com.miu.ea.springdatafirst.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
@AllArgsConstructor
public class CategoryController {

    private CategoryService categoryService;

    @PostMapping
    public void addCategory(@RequestBody Category category){
        categoryService.addCategory(category);
    }

    @GetMapping
    public List<Category> getAllCategory(){
       return categoryService.getAllCategory();
    }

    @GetMapping("/retrieve/{id}")
    public Category getById(@PathVariable Long id){
        return categoryService.getById(id);
    }

    @PutMapping("/{id}")
    public void updateCategory(@PathVariable Long id, @RequestBody Category category){
        categoryService.updateCategory(id, category);
    }

    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable Long id){
        categoryService.deleteCategory(id);
    }

}
