package edu.miu.lab3.springdatai.service;

import edu.miu.lab3.springdatai.dto.RequestProductDTO;
import edu.miu.lab3.springdatai.entity.bi.Product;

import java.util.List;

/**
 * Author: Kuylim TITH
 * Date: 11/3/2022
 */
public interface ProductService {

    RequestProductDTO save(RequestProductDTO product);

    RequestProductDTO update(Long id, RequestProductDTO product);

    List<Product> getAllProduct();

    List<Product> getAllProductGreaterThanMinPrice(Double minPrice);

    List<Product> getAllProductByCategoryAndLessThanMaxPrice(String catName, Double maxPrice);

    List<Product> getAllProductByNameContain(String keyword);
}
