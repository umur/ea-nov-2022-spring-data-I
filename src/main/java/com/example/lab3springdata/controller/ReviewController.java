package com.example.lab3springdata.controller;

import com.example.lab3springdata.model.Product;
import com.example.lab3springdata.model.Review;
import com.example.lab3springdata.service.IProductService;
import com.example.lab3springdata.service.IReviewService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/reviews")
public class ReviewController {
    private final IReviewService reviewService;
    private final IProductService productService;

    public ReviewController(IReviewService reviewService, IProductService productService) {
        this.reviewService = reviewService;
        this.productService = productService;
    }

    @GetMapping("/filter") // localhost/reviews/filter?productId=1
    public List<Review> getProductsByNameContaining(@RequestParam int productId){
        return reviewService.getReviewsByProduct(productId);
    }
}
