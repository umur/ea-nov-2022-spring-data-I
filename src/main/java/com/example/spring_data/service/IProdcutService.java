package com.example.spring_data.service;

import com.example.spring_data.dto.ProductDto;

import java.util.List;

public interface IProdcutService {
    List<ProductDto> findAll ();

    ProductDto findProductById (Integer id);

    void create (ProductDto productDto);

    void delete (Integer id);

    void update(Integer id,String name,double price);

    List<ProductDto> findProductsByPrice (double minprice);
    List<ProductDto> findByCategoryIdAndPrice(Integer id, double maxPrice);
    List<ProductDto> findProductsByNameContains(String keyword);
}
