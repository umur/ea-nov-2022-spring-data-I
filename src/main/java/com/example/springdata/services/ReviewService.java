package com.example.springdata.services;

import com.example.springdata.entities.DTOs.CategoryDTO;
import com.example.springdata.entities.DTOs.ReviewDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReviewService {
    public ReviewDTO create(ReviewDTO reviewDTO);

    public List<ReviewDTO> getAll();

    public ReviewDTO update(Long id, ReviewDTO reviewDTO);

    public String delete(Long id);
}
