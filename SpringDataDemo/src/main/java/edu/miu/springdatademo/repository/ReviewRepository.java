package edu.miu.springdatademo.repository;

import edu.miu.springdatademo.model.uniDirectional.Product;
import edu.miu.springdatademo.model.uniDirectional.Review;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends CrudRepository<Review, Integer> {

    public List<Review> findReviewByProduct_Id(int id);
}
