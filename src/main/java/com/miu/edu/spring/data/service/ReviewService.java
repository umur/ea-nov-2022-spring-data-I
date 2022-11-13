package com.miu.edu.spring.data.service;

import com.miu.edu.spring.data.dto.ReviewDto;

import java.util.List;

public interface ReviewService {

    /**
     * Get Reviews By ProductId
     * @return Reviews
     */
    List<ReviewDto> getReviewsByProductId(int productId);

    /**
     * Get Review By id
     *
     * @param id
     * @return a Review
     */
    ReviewDto getReviewById(int id);

    /**
     * Update a Review
     * @param id
     * @param review
     */
    void updateReview(int id, ReviewDto review);

    /**
     * Add a Review
     * @param review
     */
    ReviewDto addReview(ReviewDto review);

    /**
     * Remove a Review by id
     * @param id
     */
    void removeById(int id);

}
