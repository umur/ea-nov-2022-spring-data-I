package com.springdata.springdatabidirectional.controller;

import com.springdata.springdatabidirectional.entity.Category;
import com.springdata.springdatabidirectional.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @GetMapping
    public List<Category> getAddress(){
        return categoryService.getAll();
    }
    @PostMapping("/save")
    public Category saveAddress(@RequestBody Category category){
        return categoryService.save(category);
    }
    @GetMapping("/{id}")
    public Category getCategoryById(@PathVariable Long id){
        return categoryService.getById(id);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteAddressById(@PathVariable Long id){
        categoryService.deleteCategory(id);
    }
}
