package miu.edu.ealab3springdata1.service;

import miu.edu.ealab3springdata1.entity.bidirectional.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    List<Category> findAll();
    Optional<Category> findOne(Long id);
    Category save(Category category);
    void delete(Long id);
}
