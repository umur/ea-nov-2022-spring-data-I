package edu.miu.eanov2022springdataI.service;

import edu.miu.eanov2022springdataI.model.Address;
import edu.miu.eanov2022springdataI.model.Category;
import org.hibernate.sql.Update;

import java.util.List;

public interface CategoryService {
    public List<Category> getAll();
    public Category getById(long id);
    public Category add(Category category);
    public Category updateById(long id, Category category);
    public void deleteById(long id);
}
