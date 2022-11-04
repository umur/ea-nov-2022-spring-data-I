package edu.miu.lab3.springdatai.repository;

import edu.miu.lab3.springdatai.entity.bi.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Author: Kuylim TITH
 * Date: 11/3/2022
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findAllByPriceGreaterThan(Double minPrice);

    @Query("FROM bi_product o WHERE o.price > ?1")
    List<Product> findAllByPriceGreaterThanJPQL(Double minPrice);

    @Query("FROM bi_product o WHERE o.category.name = ?1 AND o.price < ?2")
    List<Product> findAllByCategoryNameAndPriceLessThanJPQL(String category, Double maxPrice);

    List<Product> findAllByCategoryNameAndPriceLessThan(String category, Double maxPrice);

    @Query("FROM bi_product o WHERE o.name LIKE ?1")
    List<Product> findAllByNameContainsJPQL(String keyword);

    List<Product> findAllByNameContains(String keyword);
}
