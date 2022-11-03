package com.example.Assignment3.contoller;

import com.example.Assignment3.entity.unidirectional.Product;
import com.example.Assignment3.service.ProductService;
import com.example.Assignment3.service.productServiceImpl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductServiceImpl productService;

    @Autowired
    public ProductController(ProductServiceImpl productService) {
        this.productService = productService;
    }

    @GetMapping("/byPrice")
    public List<Product> getAllByPriceGreaterThan(@RequestParam double minPrice){
        return productService.findAllByPriceGreaterThan(minPrice);
    }

    @GetMapping("/byCategory")
    public List<Product> getAllByCategoryAndPriceLessThan(com.example.Assignment3.entity.bidirectional.Category category, int price){
        return productService.findAllByCategoryAndPriceLessThan(category,price);
    }

    @GetMapping("/byName")
    public List<Product> getAllByNameContaining(String keyword){
        return productService.findAllByNameContaining(keyword);
    }
}
