package com.example.lab3springdata.service;

import com.example.lab3springdata.model.Product;
import com.example.lab3springdata.model.Review;
import com.example.lab3springdata.repository.ReviewRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements IReviewService {

    private final ReviewRepo reviewRepo;

    public ReviewServiceImpl(ReviewRepo reviewRepo) {
        this.reviewRepo = reviewRepo;
    }

    @Override
    public List<Review> getReviewsByProduct(int id) {
        return reviewRepo.findReviewsByProductId(id);
//        return reviewRepo.getReviews();
    }
}
