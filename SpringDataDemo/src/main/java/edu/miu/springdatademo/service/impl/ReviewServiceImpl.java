package edu.miu.springdatademo.service.impl;

import edu.miu.springdatademo.model.uniDirectional.Review;
import edu.miu.springdatademo.repository.AddressRepository;
import edu.miu.springdatademo.repository.ReviewRepository;
import edu.miu.springdatademo.service.AddressService;
import edu.miu.springdatademo.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    @Override
    public List<Review> findAll() {
        return (List<Review>) reviewRepository.findAll();
    }

    @Override
    public void save(Review review) {
        reviewRepository.save(review);
    }


    @Override
    public void delete(int id) {
        reviewRepository.deleteById(id);
    }
}
