package com.miu.ea.springdatafirst.service;

import com.miu.ea.springdatafirst.entity.Category;
import com.miu.ea.springdatafirst.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();

    void addProduct(Product product);

    Product getById(Long id);

    void updateProduct(Long id, Product product);

    List<Product> getByProductMoreThanMinPrice(Double minPrice);

    List<Product> getByProductByCategoryAndLessThanMaxPrice(Double maxPrice, Category category);

    List<Product> getAllProductsContainingName(String name);
}
