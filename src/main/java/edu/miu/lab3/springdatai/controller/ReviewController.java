package edu.miu.lab3.springdatai.controller;

import edu.miu.lab3.springdatai.dto.RequestReviewDTO;
import edu.miu.lab3.springdatai.entity.bi.Review;
import edu.miu.lab3.springdatai.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Author: Kuylim TITH
 * Date: 11/3/2022
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/reviews")
public class ReviewController {

    private final ReviewService service;

    @PostMapping
    public RequestReviewDTO createReview(@RequestBody RequestReviewDTO dto) {
        return service.save(dto);
    }

    @PutMapping("/{id}")
    public RequestReviewDTO updateReview(@PathVariable Long id, @RequestBody RequestReviewDTO dto) {
        return service.update(id, dto);
    }

    @GetMapping
    public List<Review> getAllReview() {
        return service.getAllReview();
    }

    @GetMapping("/products/{id}")
    public List<Review> getAllReviewByProduct(@PathVariable Long id) {
        return service.getAllReviewByProduct(id);
    }
}
