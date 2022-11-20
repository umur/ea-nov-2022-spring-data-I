package com.springdata_i.lab3.service;

import com.springdata_i.lab3.entity.Product;
import com.springdata_i.lab3.entity.Review;

public interface ReviewService {
    Review getReview();
    Review addReview(Review review);
    Review updateReview(Review review);
    Review deleteReview(Review review);
}
