package com.example.springdata.services.impl;

import com.example.springdata.entities.Category;
import com.example.springdata.entities.DTOs.CategoryDTO;
import com.example.springdata.entities.DTOs.ProductDTO;
import com.example.springdata.entities.Product;
import com.example.springdata.repositories.ProductRepo;
import com.example.springdata.services.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepo productRepo;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public ProductDTO create(ProductDTO productDTO) {
        Product product = modelMapper.map(productDTO, Product.class);
        Product prod = productRepo.save(product);
        return modelMapper.map(prod, ProductDTO.class);
    }

    @Override
    public List<ProductDTO> getAll() {
        return productRepo.findAll().stream().map(p -> modelMapper.map(p, ProductDTO.class)).collect(Collectors.toList());
    }

    @Override
    public ProductDTO find(Long id) {
        return modelMapper.map(productRepo.findById(id), ProductDTO.class);
    }

    @Override
    public ProductDTO update(Long id, ProductDTO productDTO) {
        Product product = productRepo.findById(id).orElseThrow(() -> new RuntimeException("No product found!!"));
        productRepo.save(product);
        return modelMapper.map(product, ProductDTO.class);
    }

    @Override
    public ProductDTO delete(Long id) {
        Product p = productRepo.findById(id).orElseThrow(() -> new RuntimeException("Product not found!!"));
        productRepo.delete(p);
        return modelMapper.map(p, ProductDTO.class);
    }

    @Override
    public List<ProductDTO> findAllByPriceGreaterThan(double price) {
        return productRepo.findAllByPriceGreaterThan(price).stream().map(p -> modelMapper.map(p, ProductDTO.class)).collect(Collectors.toList());
    }

    @Override
    public List<ProductDTO> findAllByCategoryAndPriceLessThan(CategoryDTO categoryDTO, double price) {
        Category category = modelMapper.map(categoryDTO, Category.class);
        return productRepo.findAllByCategoryAndPriceLessThan(category, price).stream().map(p -> modelMapper.map(p, ProductDTO.class)).collect(Collectors.toList());
    }

    @Override
    public List<ProductDTO> findAllByNameContaining(String keyword) {
        return productRepo.findAllByNameContainingIgnoreCase(keyword).stream().map(p -> modelMapper.map(p, ProductDTO.class)).collect(Collectors.toList());
    }
}
