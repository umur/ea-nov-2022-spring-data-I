package com.directional.SpringDataAssignment.SpringDataAssignment.Service.Impl;

import com.directional.SpringDataAssignment.SpringDataAssignment.Entity.UniDirectional.Category;
import com.directional.SpringDataAssignment.SpringDataAssignment.Entity.UniDirectional.Product;
import com.directional.SpringDataAssignment.SpringDataAssignment.Repository.CategoryRepo;
import com.directional.SpringDataAssignment.SpringDataAssignment.Service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class CategoryServiceImpl implements CategoryService {

    public final CategoryRepo categoryRepo;

    @Override
    public void saveorUpdate(Category category) {
        categoryRepo.save(category);
    }

    @Override
    public void delete(Long id) {
    categoryRepo.deleteById(id);
    }


    @Override
    public Category get(Long id) {
        return categoryRepo.findById(id).get();
    }

    @Override
    public List<Category> getAll() {
        var item = new ArrayList<Category>();
        categoryRepo.findAll().forEach(item::add);
        return  item;
    }

    @Override
    public List<Product> getProductByCategoryandPrice(Category category, double maxPrice) {
        Category cat = categoryRepo.findById(category.getId()).get();
        return cat.getProduct().stream().filter(x->x.getPrice()<maxPrice).collect(Collectors.toList());
    }
}
