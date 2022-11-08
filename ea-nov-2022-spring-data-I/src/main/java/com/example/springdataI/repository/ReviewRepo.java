package com.example.springdataI.repository;

import com.example.springdataI.entity.Category;
import com.example.springdataI.entity.Review;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepo extends CrudRepository<Review,Integer> {
    @Query("SELECT r FROM Review r WHERE r.id = ?1")
    Review findReviewById(Integer id);

    List<Review> findByProduct_Id(Integer id);
}
