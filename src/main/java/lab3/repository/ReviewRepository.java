package lab3.repository;

import lab3.models.unidirectional.UniReview;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends CrudRepository<UniReview, String> {
    List<UniReview> findAll();

    @Query(
            nativeQuery = true,
            value = "select * from uni_review inner join uni_product on uni_review.prod_id=uni_product.id\n" +
                    "where uni_product.id=:id"
    )
    List<UniReview> findAllReviewsByProductId(String id);
}
