package edu.miu.eanov2022springdataI.service.impl;

import edu.miu.eanov2022springdataI.model.Category;
import edu.miu.eanov2022springdataI.repository.CategoryRepository;
import edu.miu.eanov2022springdataI.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepo;

    @Override
    public List<Category> getAll() {
        return categoryRepo.findAll();
    }

    @Override
    public Category getById(long id) {
        return categoryRepo.getReferenceById(id);
    }

    @Override
    public Category add(Category category) {
        return categoryRepo.save(category);
    }

    @Override
    public Category updateById(long id, Category category) {
        Category newCategory = categoryRepo.getReferenceById(id);
        newCategory.setName(category.getName());
        newCategory.setProducts(category.getProducts());
        return categoryRepo.save(newCategory);
    }

    @Override
    public void deleteById(long id) {
        categoryRepo.deleteById(id);
    }
}
