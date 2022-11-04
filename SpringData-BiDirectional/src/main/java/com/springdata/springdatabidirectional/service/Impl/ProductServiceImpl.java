package com.springdata.springdatabidirectional.service.Impl;

import com.springdata.springdatabidirectional.entity.Product;
import com.springdata.springdatabidirectional.repository.ProductRepository;
import com.springdata.springdatabidirectional.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;
    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Product product) {
        return null;
    }

    @Override
    public Product getById(Long id) {
        return productRepository.findById(id).get();
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);

    }

    @Override
    public List<Product> getAll() {
        List<Product> productList=new ArrayList<>();
        productRepository.findAll().forEach(productList::add);
        return productList;
    }
    public List<Product> findProductsByPriceIsGreaterThan(double minPrice) {
        return productRepository.findProductsByPriceIsGreaterThan(minPrice);
    }
    public List<Product> findProductsByPriceIsLessThan(double maxPrice) {
        return productRepository.findProductsByPriceIsLessThan(maxPrice);
    }

    public List<Product> findProductsByNameIsLikeIgnoreCase(String name){
        return productRepository.findProductsByNameIsLikeIgnoreCase(name);
    }

    @Override
    public List<Product> findProductsByReviewsAndIdContaining(Long id) {
        return productRepository.findProductsByReviewsAndIdContaining(id);
    }
}
