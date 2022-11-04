package edu.miu.lab3.springdatai.repository;

import edu.miu.lab3.springdatai.entity.bi.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Author: Kuylim TITH
 * Date: 11/3/2022
 */
public interface ReviewRepository extends JpaRepository<Review, Long> {

    List<Review> findAllByProductId(Long productId);

    @Query("FROM bi_review o WHERE o.product.id = ?1")
    List<Review> findAllByProductIdJPQL(Long productId);
}
