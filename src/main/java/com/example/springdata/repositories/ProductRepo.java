package com.example.springdata.repositories;

import com.example.springdata.entities.Category;
import com.example.springdata.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {
    List<Product> findAllByPriceGreaterThan(double price);

    List<Product> findAllByCategoryAndPriceLessThan(Category category, double price);

    List<Product> findAllByNameContainingIgnoreCase(String keyword);

}
