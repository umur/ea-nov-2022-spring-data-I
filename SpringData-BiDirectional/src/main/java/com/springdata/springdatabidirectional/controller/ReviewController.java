package com.springdata.springdatabidirectional.controller;


import com.springdata.springdatabidirectional.entity.Product;
import com.springdata.springdatabidirectional.entity.Review;
import com.springdata.springdatabidirectional.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/review")
public class ReviewController {
    @Autowired
    private ReviewService reviewService;
    @GetMapping
    public List<Review> getReview(){
        return reviewService.getAll();
    }
    @PostMapping("/save")
    public Review saveAddress(@RequestBody Review review){
        return reviewService.save(review);
    }
    @GetMapping("/{id}")
    public Review getReviewById(@PathVariable Long id){
        return reviewService.getById(id);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteReviewById(@PathVariable Long id){
        reviewService.deleteReview(id);
    }
    @GetMapping("/filter")
    public List<Review> findReviewsByIdIs(@RequestParam Long id) {
        return reviewService.findReviewByIdIs(id);
    }
}
