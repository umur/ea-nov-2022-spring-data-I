package edu.miu.eanov2022springdataI.service;

import edu.miu.eanov2022springdataI.model.Category;
import edu.miu.eanov2022springdataI.model.Product;

import java.util.List;

public interface ProductService {
    public List<Product> getAll();
    public Product getById(long id);
    public Product add(Product product);
    public Product updateById(long id, Product product);
    public void deleteById(long id);
}
