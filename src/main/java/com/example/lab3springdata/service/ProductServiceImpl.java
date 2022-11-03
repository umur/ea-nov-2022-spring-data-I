package com.example.lab3springdata.service;

import com.example.lab3springdata.model.Product;
import com.example.lab3springdata.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private ProductRepo productRepo;

    @Override
    public List<Product> findProductsByPrice(double minPrice) {
        return productRepo.findProductsByPriceGreaterThan(minPrice);
    }

    @Override
    public List<Product> findProductsByCategory_NameAndPriceLessThan(String category_name, double price){
        return productRepo.findProductsByCategory_NameAndPriceLessThan(category_name, price);
    }

    @Override
    public List<Product> findAllByNameContaining(String filterText){
        return productRepo.findAllByNameContaining(filterText);
    }

    @Override
    public Product getProductById(int id) {
        return productRepo.findProductsById(id);
    }
}
