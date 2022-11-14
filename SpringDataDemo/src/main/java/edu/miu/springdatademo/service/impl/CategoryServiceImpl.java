package edu.miu.springdatademo.service.impl;

import edu.miu.springdatademo.model.uniDirectional.Category;
import edu.miu.springdatademo.repository.AddressRepository;
import edu.miu.springdatademo.repository.CategoryRepository;
import edu.miu.springdatademo.service.AddressService;
import edu.miu.springdatademo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> findAll() {
        return (List<Category>) categoryRepository.findAll();
    }

    @Override
    public void save(Category category) {
        categoryRepository.save(category);
    }


    @Override
    public void delete(int id) {
        categoryRepository.deleteById(id);
    }
}
