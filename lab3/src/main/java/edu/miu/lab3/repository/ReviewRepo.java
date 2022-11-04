package edu.miu.lab3.repository;

import edu.miu.lab3.entity.Review;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepo extends CrudRepository<Review, Long> {

    //List<Review> findByProductId(Long productId);
}
