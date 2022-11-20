package com.springdata.springdatabidirectional.controller;

import com.springdata.springdatabidirectional.entity.Product;
import com.springdata.springdatabidirectional.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getProduct() {

        return productService.getAllProducts();
    }

    @PostMapping("/save")
    public Product saveProduct(@RequestBody Product product) {
        return productService.save(product);
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productService.getById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteProductById(@PathVariable Long id) {
        productService.deleteProduct(id);
    }
    @GetMapping("/minPrice")
    public List<Product> findProductsByPriceIsGreaterThan(@RequestParam double minPrice) {
        return productService.findProductsByPriceIsLessThan(minPrice);
    }
    @GetMapping("/maxPrice")
    public List<Product> findProductsByNameIsLessThan(@RequestParam double maxPrice) {
        return productService.findProductsByPriceIsLessThan(maxPrice);
    }
    @GetMapping("/name")
    public List<Product> findProductsByNameIsLikeIgnoreCase(@RequestParam String name) {
        return productService.findProductsByNameIsLikeIgnoreCase(name);
    }
    @GetMapping("/review")
    public List<Product> findProductsByReviewsAndIdContaining(@RequestParam Long id) {
        return productService.findProductsByReviewsAndIdContaining(id);
    }
}
