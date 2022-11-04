package com.miu.edu.spring.data.controller;

import com.miu.edu.spring.data.dto.ReviewDto;
import com.miu.edu.spring.data.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @GetMapping("/product/{id}")
    public List<ReviewDto> getReviewByProductId(@PathVariable int id) {
        return reviewService.getReviewsByProductId(id);
    }

    @GetMapping("/{id}")
    public ReviewDto getReviewById(@PathVariable int id) {
        return reviewService.getReviewById(id);
    }

    @PutMapping
    public void updateReview(@RequestBody ReviewDto review) {
        reviewService.updateReview(review);
    }

    @PostMapping
    public void addReview(@RequestBody ReviewDto review) {
        reviewService.addReview(review);
    }

    @DeleteMapping("/{id}")
    public void removeById(@PathVariable int id) {
        reviewService.removeById(id);
    }
}
