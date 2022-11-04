package com.example.springdata.controllers;

import com.example.springdata.entities.DTOs.CategoryDTO;
import com.example.springdata.entities.DTOs.ProductDTO;
import com.example.springdata.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody ProductDTO productDTO) {
        return new ResponseEntity<>(productService.create(productDTO), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getAll() {
        return new ResponseEntity<>(productService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable(name = "id") Long id) {
        return new ResponseEntity<>(productService.find(id), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestParam ProductDTO productDTO) {
        return new ResponseEntity<>(productService.update(id, productDTO), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        return new ResponseEntity<>(productService.delete(id), HttpStatus.OK);
    }

    @GetMapping("/filter-by-price")
    public ResponseEntity<?> findAllByPriceGreaterThanGivenPrice(@RequestParam(name = "minPrice") double minPrice) {
        return new ResponseEntity<>(productService.findAllByPriceGreaterThan(minPrice), HttpStatus.OK);
    }

    @GetMapping("/filter-by-cat-price")
    public ResponseEntity<?> findAllByCatAndPrice(@RequestBody CategoryDTO categoryDTO, @RequestParam(name = "maxPrice") double maxPrice) {
        return new ResponseEntity<>(productService.findAllByCategoryAndPriceLessThan(categoryDTO, maxPrice), HttpStatus.OK);
    }

    @GetMapping("/filter-by-keyword")
    public ResponseEntity<?> findAllByCatAndPrice(@RequestParam(name = "keyword") String keyword) {
        return new ResponseEntity<>(productService.findAllByNameContaining(keyword), HttpStatus.OK);
    }
}
