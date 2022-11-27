package com.lab3.lab3.service;

import com.lab3.lab3.entity.Review;
import com.lab3.lab3.entity.Users;

import java.util.List;

public interface ReviewService {
    String saveReview(Review review,long productId,long userId);
    String deleteReview(long id);
    List<Review> getReviewsByUserId(long id);
    List<Review> getReviewsByProductId(long id);
}
