package com.example.Assignment3.repo;

import com.example.Assignment3.entity.bidirectional.Review;
import com.example.Assignment3.entity.unidirectional.Category;
import com.example.Assignment3.entity.unidirectional.Product;
import com.example.Assignment3.entity.unidirectional.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends CrudRepository<com.example.Assignment3.entity.bidirectional.Product, Integer> {

    List<Product> findAllByPriceGreaterThan(double minPrice);

    List<Product> findAllByCategoryAndPriceLessThan(com.example.Assignment3.entity.bidirectional.Category category, int price);

    List<Product> findAllByNameContaining(String keyword);

}
