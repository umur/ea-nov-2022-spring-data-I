package edu.miu.lab3.springdatai.controller;

import edu.miu.lab3.springdatai.dto.RequestCategoryDTO;
import edu.miu.lab3.springdatai.entity.bi.Category;
import edu.miu.lab3.springdatai.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Author: Kuylim TITH
 * Date: 11/3/2022
 */
@RestController
@RequestMapping("/api/v1/categories")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService service;

    @PostMapping
    public RequestCategoryDTO createCategory(@RequestBody RequestCategoryDTO dto) {
        return service.save(dto);
    }

    @PutMapping("/{id}")
    public RequestCategoryDTO updateCategory(@PathVariable Long id, @RequestBody RequestCategoryDTO dto) {
        return service.update(id, dto);
    }

    @GetMapping
    public List<Category> getAllCategories() {
        return service.getAllCategory();
    }

    @DeleteMapping("/{id}")
    public Boolean deleteCategory(@PathVariable Long id) {
        return service.deleteCategory(id);
    }
}
