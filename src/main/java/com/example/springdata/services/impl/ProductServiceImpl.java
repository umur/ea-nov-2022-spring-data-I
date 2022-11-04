package com.example.springdata.services.impl;

import com.example.springdata.entities.DTOs.ProductDTO;
import com.example.springdata.services.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public ProductDTO create(ProductDTO productDTO) {
        return null;
    }

    @Override
    public List<ProductDTO> getAll() {
        return null;
    }

    @Override
    public ProductDTO update(Long id, ProductDTO productDTO) {
        return null;
    }

    @Override
    public String delete(Long id) {
        return null;
    }
}
