package edu.miu.eanov2022springdataI.service;

import edu.miu.eanov2022springdataI.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    public List<Product> getAll();
    public Optional<Product> getById(long id);
    public Product add(Product product);
    public Product updateById(long id, Product product);
    public void deleteById(long id);
}
