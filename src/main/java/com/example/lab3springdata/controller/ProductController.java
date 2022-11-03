package com.example.lab3springdata.controller;

import com.example.lab3springdata.model.Product;
import com.example.lab3springdata.service.IProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final IProductService productService;

    public ProductController(IProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/filterByPrice")
    public List<Product> getProductsByPriceMoreThan(@RequestParam double minPrice){
        return productService.findProductsByPrice(minPrice);
    }

    @GetMapping("/filterByCategoryAndPrice")
    public List<Product> getProductsByPriceMoreThan(@RequestParam String category, @RequestParam double price){
        return productService.findProductsByCategory_NameAndPriceLessThan(category, price);
    }

    @GetMapping("/filterByName")
    public List<Product> getProductsByNameContaining(@RequestParam String name){
        return productService.findAllByNameContaining(name);
    }

}
