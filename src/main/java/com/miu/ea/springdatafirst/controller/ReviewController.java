package com.miu.ea.springdatafirst.controller;

import com.miu.ea.springdatafirst.entity.Review;
import com.miu.ea.springdatafirst.service.ReviewService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reviews")
@AllArgsConstructor
public class ReviewController {

    private ReviewService reviewService;

    @GetMapping
    public List<Review> getAllReviews() {
        return reviewService.getAllReviews();
    }

    @PostMapping
    public void addReview(@RequestBody Review review) {
        reviewService.addReview(review);
    }

    @GetMapping("/{id}")
    public Review getById(@PathVariable Long id) {
        return reviewService.getById(id);
    }

    @PutMapping("/retrieve/{id}")
    public void updateReview(@PathVariable Long id, @RequestBody Review review){
        reviewService.updateReview(id, review);
    }

    @GetMapping("/product/{id}")
    public List<Review> findAllReviewsByProductId(@PathVariable Long id){
        return reviewService.findAllReviewsByProductId(id);
    }
}
