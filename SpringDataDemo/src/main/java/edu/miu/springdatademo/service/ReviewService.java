package edu.miu.springdatademo.service;

import edu.miu.springdatademo.model.uniDirectional.Review;

import java.util.List;

public interface ReviewService {
    public List<Review> findAll();

    public void save(Review review);


    public void delete(int id);
}
