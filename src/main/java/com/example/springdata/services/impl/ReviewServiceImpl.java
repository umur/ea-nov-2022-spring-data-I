package com.example.springdata.services.impl;

import com.example.springdata.entities.DTOs.ReviewDTO;
import com.example.springdata.services.ReviewService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {
    @Override
    public ReviewDTO create(ReviewDTO reviewDTO) {
        return null;
    }

    @Override
    public List<ReviewDTO> getAll() {
        return null;
    }

    @Override
    public ReviewDTO update(Long id, ReviewDTO reviewDTO) {
        return null;
    }

    @Override
    public String delete(Long id) {
        return null;
    }
}
