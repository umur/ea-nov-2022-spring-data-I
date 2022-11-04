package com.example.lab3.controller;

import com.example.lab3.model.Review;
import com.example.lab3.service.ReviewService;
import com.example.lab3.service.ReviewServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/reviews")
@RequiredArgsConstructor
public class ReviewController {
    private final ReviewServiceImpl reviewService;

//    @GetMapping
//    public List<Review> getReviews(@RequestParam Long id){
//        List<Review> list = reviewService.getReviews(id);
//        return list;
//    }
}
