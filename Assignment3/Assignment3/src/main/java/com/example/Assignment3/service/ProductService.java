package com.example.Assignment3.service;

import com.example.Assignment3.entity.unidirectional.Product;

import java.util.List;

public interface ProductService {

    List<Product> findAllByPriceGreaterThan(double minPrice);

    List<Product> findAllByCategoryAndPriceLessThan(com.example.Assignment3.entity.bidirectional.Category category, int price);

    List<Product> findAllByNameContaining(String keyword);
}
