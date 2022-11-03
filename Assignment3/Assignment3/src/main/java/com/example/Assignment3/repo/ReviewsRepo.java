package com.example.Assignment3.repo;

import com.example.Assignment3.entity.unidirectional.Review;
import com.example.Assignment3.entity.unidirectional.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ReviewsRepo extends CrudRepository<com.example.Assignment3.entity.bidirectional.Review,Integer> {

        List<Review> findReviewByProductReview_Id(int id);
}
