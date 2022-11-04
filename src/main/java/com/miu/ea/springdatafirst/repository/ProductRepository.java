package com.miu.ea.springdatafirst.repository;

import com.miu.ea.springdatafirst.entity.Category;
import com.miu.ea.springdatafirst.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    public List<Product> findAllByPriceGreaterThan(Double price);

    public List<Product> findAllByCategoryAndPriceLessThan(Category category, Double price);

    public List<Product> findAllByNameContains(String name);

}
