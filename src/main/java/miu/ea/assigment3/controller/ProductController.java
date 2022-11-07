package miu.ea.assigment3.controller;

import miu.ea.assigment3.entity.DTOs.ProductDto;
import miu.ea.assigment3.entity.Product;
import miu.ea.assigment3.entity.Review;

import miu.ea.assigment3.entity.Userdata;
import miu.ea.assigment3.service.ProductService;
import miu.ea.assigment3.service.ReviewService;
import miu.ea.assigment3.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ProductController {
    private final ProductService productService;

    private final UserService userService;

    private final ReviewService reviewService;

    public ProductController(ProductService productService, UserService userService, ReviewService reviewService) {
        this.productService = productService;
        this.userService = userService;
        this.reviewService = reviewService;
    }
    @GetMapping
    public ResponseEntity<?> getAll() {
        return new ResponseEntity<>(productService.getAll(), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> save(@RequestBody ProductDto p) {
        return new ResponseEntity<>(productService.save(p), HttpStatus.OK);
    }
    @GetMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable int id){
        return new ResponseEntity<>(productService.delete(id),HttpStatus.OK);
    }

    @PostMapping("/review")
    public void save(@RequestBody Review r) {
        reviewService.save(r);
    }


    @GetMapping("/price")
    public ResponseEntity<?> findByPrice(@PathVariable(name = "val") float val){
       return new ResponseEntity<>(productService.findByPriceGreaterThan(val),HttpStatus.OK);
    }

    @GetMapping("/keyword")
    public ResponseEntity<?> findByKeyword(@PathVariable(name = "keyword") String keyword){
        return new ResponseEntity<>(productService.findAllByNameContaining(keyword),HttpStatus.OK);
    }
}