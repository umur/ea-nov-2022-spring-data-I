package com.example.Assignment3.service.reviewServiceImpl;

import com.example.Assignment3.entity.unidirectional.Review;
import com.example.Assignment3.repo.ReviewsRepo;
import com.example.Assignment3.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {

    private final ReviewsRepo reviewsRepo;

    @Autowired
    public ReviewServiceImpl(ReviewsRepo reviewsRepo) {
        this.reviewsRepo = reviewsRepo;
    }

    @Override
    public List<Review> findReviewByProductReview_Id(int id) {
        return reviewsRepo.findReviewByProductReview_Id(id);
    }
}
