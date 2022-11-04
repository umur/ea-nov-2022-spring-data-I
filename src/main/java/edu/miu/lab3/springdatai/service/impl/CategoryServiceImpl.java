package edu.miu.lab3.springdatai.service.impl;

import edu.miu.lab3.springdatai.dto.RequestCategoryDTO;
import edu.miu.lab3.springdatai.entity.bi.Category;
import edu.miu.lab3.springdatai.repository.CategoryRepository;
import edu.miu.lab3.springdatai.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Author: Kuylim TITH
 * Date: 11/3/2022
 */
@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository repository;

    @Override
    public RequestCategoryDTO save(RequestCategoryDTO category) {
        Category cat = new Category();
        BeanUtils.copyProperties(category, cat, "id");
        repository.save(cat);
        return category;
    }

    @Override
    public RequestCategoryDTO update(Long id, RequestCategoryDTO category) {
        Optional<Category> optional = repository.findById(id);
        if (optional.isEmpty()) {
            throw new RuntimeException("Category not found!");
        }
        Category cat = optional.get();
        BeanUtils.copyProperties(category, cat, "id");
        repository.save(cat);
        return category;
    }

    @Override
    public List<Category> getAllCategory() {
        return repository.findAll();
    }

    @Override
    public Boolean deleteCategory(Long id) {
        repository.deleteById(id);
        return true;
    }
}
