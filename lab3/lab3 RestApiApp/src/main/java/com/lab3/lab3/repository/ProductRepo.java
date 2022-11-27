package com.lab3.lab3.repository;

import com.lab3.lab3.entity.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepo extends CrudRepository<Product,Long> {

    List<Product> findAllByPriceGreaterThan(double miPrice);
    List<Product> findAllByNameContaining(String keyword);

}
