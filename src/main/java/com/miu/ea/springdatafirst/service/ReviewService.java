package com.miu.ea.springdatafirst.service;

import com.miu.ea.springdatafirst.entity.Review;

import java.util.List;

public interface ReviewService {
    List<Review> getAllReviews();

    void addReview(Review review);

    Review getById(Long id);

    void updateReview(Long id, Review review);

    List<Review> findAllReviewsByProductId(Long id);
}
