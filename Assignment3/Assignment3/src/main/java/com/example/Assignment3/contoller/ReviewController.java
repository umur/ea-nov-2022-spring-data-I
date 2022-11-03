package com.example.Assignment3.contoller;

import com.example.Assignment3.entity.unidirectional.Review;
import com.example.Assignment3.service.reviewServiceImpl.ReviewServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

    private final ReviewServiceImpl reviewService;

    @Autowired
    public ReviewController(ReviewServiceImpl reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping("/byId")
    public List<Review> findReviewByProductReview_Id(@RequestParam int id){
        return reviewService.findReviewByProductReview_Id(id);
    }

}
