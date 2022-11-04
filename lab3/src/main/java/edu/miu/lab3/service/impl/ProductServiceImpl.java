package edu.miu.lab3.service.impl;

import edu.miu.lab3.entity.Category;
import edu.miu.lab3.entity.Product;
import edu.miu.lab3.entity.Review;
import edu.miu.lab3.repository.CategoryRepo;
import edu.miu.lab3.repository.ProductRepo;
import edu.miu.lab3.repository.ReviewRepo;
import edu.miu.lab3.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepo productRepo;

    @Override
    public void save(Product product) {
        productRepo.save(product);
    }

    @Override
    public void delete(Long productId) {
        productRepo.deleteById(productId);
    }

    @Override
    public Product getById(Long productId) {
        return productRepo.findById(productId).get();
    }

    @Override
    public List<Product> getAll() {
        var productList = new ArrayList<Product>();
        productRepo.findAll().forEach(productList::add);

        return productList;
    }

    @Override
    public List<Product> findAllByPriceGreaterThan(double minPrice) {
        return productRepo.findAllByPriceGreaterThan(minPrice);
    }

    @Override
    public List<Product> findAllByNameContaining(String name) {
        return productRepo.findAllByNameContaining(name);
    }

    @Override
    public List<Review> findReviewByProductId(Long productId) {
        return productRepo.findById(productId).get().getReviews();
    }

}
