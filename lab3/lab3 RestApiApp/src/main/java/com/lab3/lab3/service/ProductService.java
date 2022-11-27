package com.lab3.lab3.service;

import com.lab3.lab3.entity.Category;
import com.lab3.lab3.entity.Product;

import java.util.List;

public interface ProductService {
    String addProduct(Product product,long categoryid);
    String DeleteProduct(long id);
    List<Product> products();
    Product findProductById(long id);
    List<Product> findAllByNameContaining(String keyword);
    List<Product> productByCategoryAndPriceLessThan(long categoryid,double maxPrice);
    List<Product> findAllByPriceGreaterThan(double miPrice);
}
