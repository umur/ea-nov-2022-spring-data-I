package edu.miu.springdatademo.service;

import edu.miu.springdatademo.model.uniDirectional.Product;

import java.util.List;

public interface ProductService {
    public List<Product> findAll();

    public void save(Product product);

    public List<Product> findProductByPriceGreaterThan(int price);

    public List<Product> findProductByCategory_NameAndPriceLessThan(String category, int price);


    public List<Product> findProductByNameContainingIgnoreCase(String keyword);
    public void delete(int id);
}
