package com.springdata.springdatabidirectional.service;


import com.springdata.springdatabidirectional.entity.Address;
import com.springdata.springdatabidirectional.entity.Product;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductService {
    Product save(Product product);
    Product updateProduct(Product product);
    Product getById(Long id);
    void deleteProduct(Long id);
    List<Product> getAllProducts();
     List<Product> findProductsByPriceIsGreaterThan(double minPrice);
     List<Product> findProductsByPriceIsLessThan(double maxPrice);
    List<Product> findProductsByNameIsLikeIgnoreCase(String name);
    List<Product> findProductsByReviewsAndIdContaining(@Param("id")Long  id);

}
