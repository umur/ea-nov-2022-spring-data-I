package miu.edu.lab3.repository;

import miu.edu.lab3.entity.Review;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepo extends CrudRepository<Review, Integer> {
    List<Review> findByProductId(int productId);


}
