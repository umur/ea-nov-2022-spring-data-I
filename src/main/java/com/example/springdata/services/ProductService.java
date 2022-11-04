package com.example.springdata.services;

import com.example.springdata.entities.DTOs.CategoryDTO;
import com.example.springdata.entities.DTOs.ProductDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    public ProductDTO create(ProductDTO productDTO);

    public List<ProductDTO> getAll();

    ProductDTO find(Long id);

    public ProductDTO update(Long id, ProductDTO productDTO);

    public ProductDTO delete(Long id);

    List<ProductDTO> findAllByPriceGreaterThan(double price);

    List<ProductDTO> findAllByCategoryAndPriceLessThan(CategoryDTO categoryDTO, double price);

    List<ProductDTO> findAllByNameContaining(String keyword);
}
