package com.miu.ea.springdatafirst.controller;

import com.miu.ea.springdatafirst.entity.Category;
import com.miu.ea.springdatafirst.entity.Product;
import com.miu.ea.springdatafirst.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@AllArgsConstructor
public class ProductController {

    private ProductService productService;

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping
    public void addProduct(@RequestBody Product product) {
        productService.addProduct(product);
    }

    @GetMapping("retrieve/{id}")
    public Product getById(@PathVariable Long id) {
        return productService.getById(id);
    }

    @PutMapping("/{id}")
    public void updateProduct(@PathVariable Long id, @RequestBody Product product){
        productService.updateProduct(id, product);
    }

    @GetMapping("/minPrice/{minPrice}")
    public List<Product> getByProductMoreThanMinPrice(@PathVariable Double minPrice){
        return productService.getByProductMoreThanMinPrice(minPrice);
    }

    @PostMapping("/maxPrice/{maxPrice}")
    public List<Product> getByProductByCategoryAndLessThanMaxPrice(@PathVariable Double maxPrice, @RequestBody Category category){
        return productService.getByProductByCategoryAndLessThanMaxPrice(maxPrice, category);
    }

    @GetMapping("/keyword/{name}")
    public List<Product> getAllProductsContainingName(@PathVariable String name){
        return productService.getAllProductsContainingName(name);
    }
}
