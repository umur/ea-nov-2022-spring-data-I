package com.example.lab3springdata.service;

import com.example.lab3springdata.model.Product;

import java.util.List;

public interface IProductService {
    //Find all products that cost more than `minPrice`.
    List<Product> findProductsByPrice(double minPrice);

    List<Product> findProductsByCategory_NameAndPriceLessThan(String category_name, double price);

    List<Product> findAllByNameContaining(String filterText);

    Product getProductById(int id);
}
