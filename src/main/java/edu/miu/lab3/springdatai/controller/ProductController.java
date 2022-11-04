package edu.miu.lab3.springdatai.controller;

import edu.miu.lab3.springdatai.dto.RequestProductDTO;
import edu.miu.lab3.springdatai.entity.bi.Product;
import edu.miu.lab3.springdatai.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Author: Kuylim TITH
 * Date: 11/3/2022
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/products")
public class ProductController {

    private final ProductService service;

    @PostMapping
    public RequestProductDTO createProduct(@RequestBody RequestProductDTO dto) {
        return service.save(dto);
    }

    @PutMapping("/{id}")
    public RequestProductDTO updateProduct(@PathVariable Long id, @RequestBody RequestProductDTO dto) {
        return service.update(id, dto);
    }

    @GetMapping
    public List<Product> getAllProduct() {
        return service.getAllProduct();
    }

    @GetMapping("/filter")
    public List<Product> getProductByNameContains(@RequestParam String keyword) {
        return service.getAllProductByNameContain(keyword);
    }

    @GetMapping("/min-price/{min}")
    public List<Product> getAllProductPriceGreaterThan(@PathVariable Double min) {
        return service.getAllProductGreaterThanMinPrice(min);
    }

    @GetMapping("/categories/{cat}/max-price/{max}")
    public List<Product> getAllProductByCategoryAndPriceLessThan(@PathVariable String cat,
                                                                 @PathVariable Double max) {
        return service.getAllProductByCategoryAndLessThanMaxPrice(cat, max);
    }
}
