package com.miu.ea.springdatafirst.service.impl;

import com.miu.ea.springdatafirst.entity.Review;
import com.miu.ea.springdatafirst.repository.ReviewRepository;
import com.miu.ea.springdatafirst.service.ReviewService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ReviewServiceImpl implements ReviewService {

    private ReviewRepository reviewRepository;

    @Override
    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    @Override
    public void addReview(Review review) {
        reviewRepository.save(review);
    }

    @Override
    public Review getById(Long id) {
        return reviewRepository.findById(id).get();
    }

    @Override
    public void updateReview(Long id, Review review) {
        Review reviewToUpdate = getById(id);
        reviewToUpdate = review;
        reviewRepository.save(review);
    }

    @Override
    public List<Review> findAllReviewsByProductId(Long id) {
        return reviewRepository.findAllByProductId(id);
    }
}
