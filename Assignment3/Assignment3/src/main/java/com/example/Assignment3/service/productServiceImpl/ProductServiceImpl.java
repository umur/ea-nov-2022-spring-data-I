package com.example.Assignment3.service.productServiceImpl;

import com.example.Assignment3.entity.bidirectional.Category;
import com.example.Assignment3.entity.unidirectional.Product;
import com.example.Assignment3.repo.ProductRepo;
import com.example.Assignment3.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepo productRepo;

    @Autowired
    public ProductServiceImpl(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @Override
    public List<Product> findAllByPriceGreaterThan(double minPrice) {
        return productRepo.findAllByPriceGreaterThan(minPrice);
    }

    @Override
    public List<Product> findAllByCategoryAndPriceLessThan(Category category, int price) {
        return productRepo.findAllByCategoryAndPriceLessThan(category, price);
    }

    @Override
    public List<Product> findAllByNameContaining(String keyword) {
        return productRepo.findAllByNameContaining(keyword);
    }
}
