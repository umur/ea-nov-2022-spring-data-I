package edu.miu.lab3.controller;

import edu.miu.lab3.entity.Category;
import edu.miu.lab3.entity.Product;
import edu.miu.lab3.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/lab3/category")
public class CategoryController {

    private final CategoryService categoryService;

    @PostMapping
    public String create(@RequestBody Category category) {
        try {
            categoryService.save(category);

            return "Category saved successfully.";
        }
        catch (Exception e) {
            e.printStackTrace();
            return "Error occurred while saving Category.";
        }
    }

    @PutMapping
    public String update(@RequestBody Category category) {
        try {
            categoryService.save(category);

            return "Category updated successfully.";
        }
        catch (Exception e) {
            e.printStackTrace();
            return "Error occurred while updating Category.";
        }
    }

    @DeleteMapping("/{categoryId}")
    public String delete(@PathVariable Long categoryId) {
        try {
            categoryService.delete(categoryId);

            return "Category deleted successfully.";
        }
        catch (Exception e) {
            e.printStackTrace();
            return "Error occurred while deleting Category.";
        }
    }

    @GetMapping
    public List<Category> getAll() {
        return categoryService.getAll();
    }

    @GetMapping("/{categoryId}")
    public Category getById(@PathVariable Long categoryId) {
        return categoryService.getById(categoryId);
    }

    @GetMapping("/filterProductByCategoryAndPriceLessThanMaxPrice")
    public List<Product> filterProductByCategoryAndPriceLessThanMaxPrice(@RequestBody Category cat, @RequestParam double maxPrice) {
        return categoryService.findAllByCategoryAndPriceLessThan(cat, maxPrice);
    }

}
