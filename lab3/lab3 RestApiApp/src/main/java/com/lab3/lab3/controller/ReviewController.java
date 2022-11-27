package com.lab3.lab3.controller;

import com.lab3.lab3.entity.Review;
import com.lab3.lab3.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("reviews")
public class ReviewController {
    @Autowired
    private ReviewService reviewService;

    @PostMapping("/{userid}/{productid}")
    public String addReview(@RequestBody Review review
                           ,@PathVariable long productid ,@PathVariable long userid){
        return reviewService.saveReview(review,productid,userid);
    }

    @GetMapping("/user/{userid}")
    public List<Review> getReviewsByUserId(@PathVariable long userid){
        return reviewService.getReviewsByUserId(userid);
    }
    @GetMapping("/product/{productid}")
    public List<Review> getReviewsByProductId(@PathVariable long productid){
        return reviewService.getReviewsByProductId(productid);
    }

    @DeleteMapping("/{id}")
    public String deleteReview (@PathVariable long id){
        return reviewService.deleteReview(id);
    }
}
