package miu.edu.ealab3springdata1.repository;

import miu.edu.ealab3springdata1.entity.bidirectional.Category;
import miu.edu.ealab3springdata1.entity.bidirectional.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {

    List<Product> findAllByPriceGreaterThanEqual(Double minPrice);
    List<Product> findAllByCategoryAndPriceLessThanEqual(Category category, Double maxPrice);
    List<Product> findAllByNameContaining(String name);
}
