package edu.miu.lab3.springdatai.service;

import edu.miu.lab3.springdatai.dto.RequestReviewDTO;
import edu.miu.lab3.springdatai.entity.bi.Review;

import java.util.List;

/**
 * Author: Kuylim TITH
 * Date: 11/3/2022
 */
public interface ReviewService {

    RequestReviewDTO save(RequestReviewDTO review);

    RequestReviewDTO update(Long id, RequestReviewDTO review);

    List<Review> getAllReview();

    List<Review> getAllReviewByProduct(Long productId);
}
