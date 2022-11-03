package com.example.lab3springdata.service;

import com.example.lab3springdata.model.Product;
import com.example.lab3springdata.model.Review;

import java.util.List;

public interface IReviewService {
    List<Review> getReviewsByProduct(int id);
}
