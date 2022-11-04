package com.miu.ea.springdatafirst.service.impl;

import com.miu.ea.springdatafirst.entity.Category;
import com.miu.ea.springdatafirst.entity.Product;
import com.miu.ea.springdatafirst.repository.ProductRepository;
import com.miu.ea.springdatafirst.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public void addProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public Product getById(Long id) {
        return productRepository.findById(id).get();
    }

    @Override
    public void updateProduct(Long id, Product product) {
        Product productToUpdate = getById(id);
        productToUpdate = product;
        productRepository.save(product);
    }

    @Override
    public List<Product> getByProductMoreThanMinPrice(Double minPrice) {
        return productRepository.findAllByPriceGreaterThan(minPrice);
    }

    @Override
    public List<Product> getByProductByCategoryAndLessThanMaxPrice(Double maxPrice, Category category) {
        return productRepository.findAllByCategoryAndPriceLessThan(category, maxPrice);
    }

    @Override
    public List<Product> getAllProductsContainingName(String name) {
        return productRepository.findAllByNameContains(name);
    }
}
