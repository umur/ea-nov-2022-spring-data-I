package com.example.springdata.services.impl;

import com.example.springdata.entities.DTOs.ReviewDTO;
import com.example.springdata.entities.Review;
import com.example.springdata.repositories.ReviewRepo;
import com.example.springdata.services.ReviewService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReviewServiceImpl implements ReviewService {
    @Autowired
    ReviewRepo reviewRepo;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public ReviewDTO create(ReviewDTO reviewDTO) {
        Review r = modelMapper.map(reviewDTO, Review.class);
        Review re = reviewRepo.save(r);
        return modelMapper.map(re, ReviewDTO.class);
    }

    @Override
    public List<ReviewDTO> getAll() {
        return reviewRepo.findAll().stream().map(re -> modelMapper.map(re, ReviewDTO.class)).collect(Collectors.toList());
    }

    @Override
    public ReviewDTO find(Long id) {
        return modelMapper.map(reviewRepo.findById(id), ReviewDTO.class);
    }

    @Override
    public ReviewDTO update(Long id, ReviewDTO reviewDTO) {
        Review review = reviewRepo.findById(id).orElseThrow(() -> new RuntimeException("Review not found!!!"));
        return modelMapper.map(reviewRepo.save(review), ReviewDTO.class);
    }

    @Override
    public ReviewDTO delete(Long id) {
        Review review = reviewRepo.findById(id).orElseThrow(() -> new RuntimeException("Review not found!!!"));
        reviewRepo.delete(review);
        return modelMapper.map(review, ReviewDTO.class);
    }

    @Override
    public List<ReviewDTO> findByProductId(Long id) {
        return reviewRepo.findAllByProductId(id).stream().map(r -> modelMapper.map(r, ReviewDTO.class)).collect(Collectors.toList());
    }
}
