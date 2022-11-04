package com.example.Product.Review.controller;

import com.example.Product.Review.entities.join_column.Review;
import com.example.Product.Review.service.impl.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reviews")
@RequiredArgsConstructor
public class ReviewController {

    private final ReviewService reviewService;

    @GetMapping
    public List<Review> findAll() {
        return reviewService.findAll();
    }

    @GetMapping("/{id}")
    public Review findById(@PathVariable long id) {
        return reviewService.findById(id);
    }

    @PostMapping
    public void create(@RequestBody Review review) {
        reviewService.save(review);
    }

    @PutMapping
    public void update(@RequestBody Review review) {
        reviewService.update(review);
    }

    @DeleteMapping
    public void delete(@RequestBody Review review) {
        reviewService.delete(review);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable long id) {
        reviewService.deleteById(id);
    }

}
