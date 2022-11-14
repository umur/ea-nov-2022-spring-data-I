package edu.miu.springdatademo.service;

import edu.miu.springdatademo.model.uniDirectional.Category;


public interface CategoryService {
    public Iterable<Category> findAll();

    public void save(Category category);


    public void delete(int id);
}
