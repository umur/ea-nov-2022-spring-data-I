package edu.miu.lab3.service;

import edu.miu.lab3.entity.Category;
import edu.miu.lab3.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {

    void save(Category category);

    void delete(Long categoryId);

    Category getById(Long categoryId);

    List<Category> getAll();

    List<Product> findAllByCategoryAndPriceLessThan(Category cat, double maxPrice);

}
