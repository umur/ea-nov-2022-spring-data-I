package com.example.springdata.services;

import com.example.springdata.entities.DTOs.ReviewDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReviewService {
    public ReviewDTO create(ReviewDTO reviewDTO);

    public List<ReviewDTO> getAll();

    ReviewDTO find(Long id);

    public ReviewDTO update(Long id, ReviewDTO reviewDTO);

    public ReviewDTO delete(Long id);

    List<ReviewDTO> findByProductId(Long id);
}
