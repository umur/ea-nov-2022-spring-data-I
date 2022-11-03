package com.example.Assignment3.service;

import com.example.Assignment3.entity.unidirectional.Review;

import java.util.List;

public interface ReviewService {
    List<Review> findReviewByProductReview_Id(int id);
}
