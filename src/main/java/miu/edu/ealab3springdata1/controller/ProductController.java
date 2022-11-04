package miu.edu.ealab3springdata1.controller;

import miu.edu.ealab3springdata1.entity.bidirectional.Category;
import miu.edu.ealab3springdata1.entity.bidirectional.Product;
import miu.edu.ealab3springdata1.entity.bidirectional.Review;
import miu.edu.ealab3springdata1.service.impl.ProductServiceImpl;
import miu.edu.ealab3springdata1.service.impl.ReviewServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("products")
public class ProductController {

    @Autowired
    private ProductServiceImpl service;

    @Autowired
    private ReviewServiceImpl reviewService;

    @GetMapping
    public ResponseEntity<List<Product>> getAll(){
        return ResponseEntity.status(HttpStatus.OK).body(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Product>> getOne(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(service.findOne(id));
    }

    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product){
        return ResponseEntity.status(HttpStatus.OK).body(service.save(product));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable Long id,@RequestBody Product product){
        product.setId(id);
        return ResponseEntity.status(HttpStatus.OK).body(service.save(product));
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id){
        service.delete(id);
    }

    @GetMapping("/{id}/reviews")
    public ResponseEntity<List<Review>> getProductReviews(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(reviewService.findAllReviewByProductId(id));
    }

    @GetMapping("/minPrice")
    public ResponseEntity<List<Product>> getProductsByMinPrice(@RequestParam Double minPrice){
        return ResponseEntity.status(HttpStatus.OK).body(service.findAllWithMinPrice(minPrice));
    }

    @GetMapping("/category-and-maxPrice/")
    public ResponseEntity<List<Product>> getProductsByCategoryAndMaxPrice(@RequestBody Category category, @RequestParam Double maxPrice){
        return ResponseEntity.status(HttpStatus.OK).body(service.findAllWithCategoryAndMaxPrice(category,maxPrice));
    }

    @GetMapping("/filter/{keyword}")
    public ResponseEntity<List<Product>> getProductsByName(@PathVariable String keyword){
        return ResponseEntity.status(HttpStatus.OK).body(service.findAllWithNameContains(keyword));
    }
}
