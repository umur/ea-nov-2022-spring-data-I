package miu.edu.ealab3springdata1.service;

import miu.edu.ealab3springdata1.entity.bidirectional.Review;

import java.util.List;
import java.util.Optional;

public interface ReviewService {
    List<Review> findAll();
    Optional<Review> findOne(Long id);
    Review save(Review review);
    void delete(Long id);

    List<Review> findAllReviewByProductId(Long id);

}
