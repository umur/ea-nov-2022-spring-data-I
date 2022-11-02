package miu.edu.jpa.repository;

import miu.edu.jpa.model.Category;
import miu.edu.jpa.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAllByPriceGreaterThanEqual(Double price);
    List<Product> findAllByCategoryAndPriceLessThanEqual(Category category, Double price);
    List<Product> findAllByNameContains(String name);
}
