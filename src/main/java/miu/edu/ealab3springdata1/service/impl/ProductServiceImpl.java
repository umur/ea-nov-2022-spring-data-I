package miu.edu.ealab3springdata1.service.impl;

import miu.edu.ealab3springdata1.entity.bidirectional.Category;
import miu.edu.ealab3springdata1.entity.bidirectional.Product;
import miu.edu.ealab3springdata1.repository.ProductRepo;
import miu.edu.ealab3springdata1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepo productRepo;

    @Override
    public List<Product> findAll() {
        return productRepo.findAll();
                //.stream().collect(Collectors.toList());
    }

    @Override
    public Optional<Product> findOne(Long id) {
        return productRepo.findById(id);
    }

    @Override
    public Product save(Product product) {
        productRepo.save(product);
        return product;
    }

    @Override
    public void delete(Long id) {
        productRepo.deleteById(id);
    }

    @Override
    public List<Product> findAllWithMinPrice(Double minPrice) {
        return productRepo.findAllByPriceGreaterThanEqual(minPrice);
    }

    @Override
    public List<Product> findAllWithCategoryAndMaxPrice(Category category, Double maxPrice) {
        return productRepo.findAllByCategoryAndPriceLessThanEqual(category,maxPrice);
    }

    @Override
    public List<Product> findAllWithNameContains(String name) {
        return productRepo.findAllByNameContaining(name);
    }
}
