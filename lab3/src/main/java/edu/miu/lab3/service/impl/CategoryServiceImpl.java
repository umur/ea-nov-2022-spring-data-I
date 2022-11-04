package edu.miu.lab3.service.impl;

import edu.miu.lab3.entity.Category;
import edu.miu.lab3.entity.Product;
import edu.miu.lab3.repository.CategoryRepo;
import edu.miu.lab3.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepo categoryRepo;

    @Override
    public void save(Category category) {
        categoryRepo.save(category);
    }

    @Override
    public void delete(Long categoryId) {
        categoryRepo.deleteById(categoryId);
    }

    @Override
    public Category getById(Long categoryId) {
        return categoryRepo.findById(categoryId).get();
    }

    @Override
    public List<Category> getAll() {
        var categoryList = new ArrayList<Category>();
        categoryRepo.findAll().forEach(categoryList::add);

        return categoryList;
    }

    @Override
    public List<Product> findAllByCategoryAndPriceLessThan(Category cat, double maxPrice) {
        return categoryRepo.findById(cat.getId()).get().getProducts().stream()
                .filter(p -> p.getPrice() < maxPrice).toList();
    }
}
