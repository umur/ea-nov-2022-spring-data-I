package com.springdata.springdatabidirectional.service;


import com.springdata.springdatabidirectional.entity.Product;
import com.springdata.springdatabidirectional.entity.Review;

import java.util.List;

public interface ReviewService {
    Review save(Review review);
    Review updateReview(Review review);
    Review getById(Long id);
    void deleteReview(Long id);
    List<Review> getAll();
    List<Review> findReviewByIdIs(Long id);
}
