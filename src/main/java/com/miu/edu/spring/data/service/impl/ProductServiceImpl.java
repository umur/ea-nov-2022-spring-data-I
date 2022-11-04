package com.miu.edu.spring.data.service.impl;

import com.miu.edu.spring.data.dto.ProductDto;
import com.miu.edu.spring.data.entity.Product;
import com.miu.edu.spring.data.exception.NotFoundException;
import com.miu.edu.spring.data.repository.ProductRepository;
import com.miu.edu.spring.data.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<ProductDto> getAllProducts() {
        return productRepository.findAll().stream().map(ProductDto::convertFrom).toList();
    }

    @Override
    public List<ProductDto> searchProductsByName(String name) {
        return productRepository.findByNameContainingIgnoreCase(name).stream().map(ProductDto::convertFrom).toList();
    }

    @Override
    public List<ProductDto> getAllProductsByCategoryId(int categoryId) {
        return productRepository.getProductsByCategoryId(categoryId).stream().map(ProductDto::convertFrom).toList();
    }

    @Override
    public ProductDto getProductById(int id) {
        return ProductDto.convertFrom(
                productRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Can't find the product with id "))
        );
    }

    @Override
    public void updateProduct(ProductDto product) {
        productRepository.findById(product.getId()).ifPresent(p -> {
            p.setName(product.getName());
            p.setPrice(product.getPrice());
            p.setRating(product.getRating());
            productRepository.save(p);
        });
    }

    @Override
    public void addProduct(ProductDto product) {
        productRepository.save(ProductDto.convertTo(product));
    }

    @Override
    public void removeById(int id) {
        productRepository.deleteById(id);
    }

    @Override
    public List<ProductDto> findProductsByPriceGreaterThanEqual(Double minPrice) {
        return productRepository.findProductsByPriceGreaterThanEqual(minPrice).stream()
                .map(ProductDto::convertFrom)
                .toList();
    }

    @Override
    public List<ProductDto> findProductsByCategoryIdAndPriceLessThanEqual(int id, Double maxPrice) {
        return productRepository.findProductsByCategory_IdAndPriceLessThanEqual(id, maxPrice).stream()
                .map(ProductDto::convertFrom)
                .toList();
    }
}
