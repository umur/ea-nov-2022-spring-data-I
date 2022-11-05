package edu.miu.eanov2022springdataI.service.impl;

import edu.miu.eanov2022springdataI.model.Product;
import edu.miu.eanov2022springdataI.repository.ProductRepository;
import edu.miu.eanov2022springdataI.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepo;

    @Override
    public List<Product> getAll() {
        return productRepo.findAll();
    }

    @Override
    public Product getById(long id) {
        return productRepo.getReferenceById(id);
    }

    @Override
    public Product add(Product product) {
        return productRepo.save(product);
    }

    @Override
    public Product updateById(long id, Product product) {
        Product newProduct = productRepo.getReferenceById(id);
        newProduct.setName(product.getName());
        newProduct.setCategory(product.getCategory());
        newProduct.setReviews(product.getReviews());
        newProduct.setRating(product.getRating());
        newProduct.setRating(product.getRating());
        return productRepo.save(newProduct);
    }

    @Override
    public void deleteById(long id) {
        productRepo.deleteById(id);
    }
}
