package com.miu.edu.spring.data.repository;

import com.miu.edu.spring.data.entity.Review;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends CrudRepository<Review, Integer> {

    List<Review> getAllByProductId(int productId);
}
