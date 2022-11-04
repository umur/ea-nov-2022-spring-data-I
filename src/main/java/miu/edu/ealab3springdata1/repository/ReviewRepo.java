package miu.edu.ealab3springdata1.repository;

import miu.edu.ealab3springdata1.entity.bidirectional.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepo extends JpaRepository<Review, Long> {
    @Query("select s from JCReview s where s.user.id = :id")
    List<Review> findAllByUserId(Long id);
}
