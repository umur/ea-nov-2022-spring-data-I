package com.springdata_i.lab3.service;

import com.springdata_i.lab3.entity.Category;
import com.springdata_i.lab3.entity.Product;

public interface ProductService {
    Product getProduct();
    Product addProduct(Product product);
    Product updateProduct(Product product);
    Product deleteProduct(Product product);
}
