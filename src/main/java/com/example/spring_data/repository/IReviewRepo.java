package com.example.spring_data.repository;

import com.example.spring_data.entity.Review;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IReviewRepo extends CrudRepository<Review,Integer> {
    List<Review> getReviewByProduct(int id);
}
