package miu.edu.ealab3springdata1.service.impl;

import miu.edu.ealab3springdata1.entity.bidirectional.Review;
import miu.edu.ealab3springdata1.repository.ReviewRepo;
import miu.edu.ealab3springdata1.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private ReviewRepo repo;
    @Override
    public List<Review> findAll() {
        return (List<Review>) repo.findAll();
    }

    @Override
    public Optional<Review> findOne(Long id) {
        return repo.findById(id);
    }

    @Override
    public Review save(Review review) {
        return repo.save(review);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }

    @Override
    public List<Review> findAllReviewByProductId(Long id) {
        return repo.findAllByUserId(id);
    }
}
