package edu.miu.lab3.controller;

import edu.miu.lab3.entity.Product;
import edu.miu.lab3.entity.Review;
import edu.miu.lab3.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/lab3/product")
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public String create(@RequestBody Product product) {
        try {
            productService.save(product);

            return "Product saved successfully.";
        }
        catch (Exception e) {
            e.printStackTrace();
            return "Error occurred while saving Product.";
        }
    }

    @PutMapping
    public String update(@RequestBody Product product) {
        try {
            productService.save(product);

            return "Product updated successfully.";
        }
        catch (Exception e) {
            e.printStackTrace();
            return "Error occurred while updating Product.";
        }
    }

    @DeleteMapping("/{productId}")
    public String delete(@PathVariable Long productId) {
        try {
            productService.delete(productId);

            return "Product deleted successfully.";
        }
        catch (Exception e) {
            e.printStackTrace();
            return "Error occurred while deleting Product.";
        }
    }

    @GetMapping
    public List<Product> getAll() {
        return productService.getAll();
    }

    @GetMapping("/{productId}")
    public Product getById(@PathVariable Long productId) {
        return productService.getById(productId);
    }

    @GetMapping("/filterByPriceGreaterThanMinPrice")
    public List<Product> filterAllByPriceGreaterThan(@RequestParam double minPrice) {
        return productService.findAllByPriceGreaterThan(minPrice);
    }

    @GetMapping("/filterByNameContaining")
    public List<Product> filterAllByNameContaining(@RequestParam String name) {
        return productService.findAllByNameContaining(name);
    }

    @GetMapping("/filterReviewByProductId")
    public List<Review> filterReviewByProductId(@RequestParam Long productId) {
        return productService.findReviewByProductId(productId);
    }

}
