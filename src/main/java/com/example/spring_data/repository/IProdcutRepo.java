package com.example.spring_data.repository;

import com.example.spring_data.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProdcutRepo extends CrudRepository<Product,Integer> {
    //findAllByPriceGreaterThan
    List<Product> findProductsByPriceGreaterThanEqual(double minPrice);

    List<Product> findByCategory_IdAndPriceLessThanEqual(Integer id, double maxPrice);

    List<Product> findProductsByNameContains(String keyword);

}
