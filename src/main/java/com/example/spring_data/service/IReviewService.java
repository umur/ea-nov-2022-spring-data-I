package com.example.spring_data.service;

import com.example.spring_data.dto.ReviewDto;

import java.util.List;

public interface IReviewService {
    List<ReviewDto> findAll ();

    ReviewDto findReviewById (Integer id);

    void create (ReviewDto reviewDto);

    void delete (Integer id);

    void update(Integer id,String comment);

    List<ReviewDto> findByProduct_Id(Integer id);
}
