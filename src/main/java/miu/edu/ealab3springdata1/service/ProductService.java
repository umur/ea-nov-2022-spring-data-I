package miu.edu.ealab3springdata1.service;

import miu.edu.ealab3springdata1.entity.bidirectional.Category;
import miu.edu.ealab3springdata1.entity.bidirectional.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> findAll();
    Optional<Product> findOne(Long id);
    Product save(Product product);
    void delete(Long id);

    List<Product> findAllWithMinPrice(Double minPrice);
    List<Product> findAllWithCategoryAndMaxPrice(Category category, Double maxPrice);
    List<Product> findAllWithNameContains(String name);
}
