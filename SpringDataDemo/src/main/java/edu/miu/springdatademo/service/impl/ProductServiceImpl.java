package edu.miu.springdatademo.service.impl;

import com.fasterxml.jackson.annotation.JsonIgnore;
import edu.miu.springdatademo.model.uniDirectional.Address;
import edu.miu.springdatademo.model.uniDirectional.Product;
import edu.miu.springdatademo.repository.AddressRepository;
import edu.miu.springdatademo.repository.ProductRepository;
import edu.miu.springdatademo.service.AddressService;
import edu.miu.springdatademo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @JsonIgnore
    @Override
    public List<Product> findAll() {
        return (List<Product>) productRepository.findAll();
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public List<Product> findProductByPriceGreaterThan(int price) {
        return productRepository.findProductByPriceGreaterThan(price);
    }

    @Override
    public List<Product> findProductByCategory_NameAndPriceLessThan(String category, int price) {
        return productRepository.findProductByCategory_NameAndPriceLessThan(category, price);
    }

    @Override
    public List<Product> findProductByNameContainingIgnoreCase(String keyword) {
        return productRepository.findProductByNameContainingIgnoreCase(keyword);
    }


    @Override
    public void delete(int id) {productRepository.deleteById(id);
    }
}
