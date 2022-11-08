package com.example.springdataI.service;

import com.example.springdataI.dto.ReviewDto;
import com.example.springdataI.entity.Review;

import java.util.List;

public interface ReviewService {
    public List <ReviewDto> findAll ();

    public ReviewDto findReviewById (Integer id);

    void create (ReviewDto reviewDto);

    void delete (Integer id);

    void update(Integer id,String comment);

    List<ReviewDto> findByProduct_Id(Integer id);
}
