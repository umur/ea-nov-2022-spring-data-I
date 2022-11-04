package com.example.springdata.services;

import com.example.springdata.entities.DTOs.CategoryDTO;
import com.example.springdata.entities.DTOs.ProductDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    public ProductDTO create(ProductDTO productDTO);

    public List<ProductDTO> getAll();

    public ProductDTO update(Long id, ProductDTO productDTO);

    public String delete(Long id);
}
