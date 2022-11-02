package miu.edu.jpa.service;

import miu.edu.jpa.dto.CategoryDTO;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    List<CategoryDTO> findAll();
    Optional<CategoryDTO> findOne(Long id);
    CategoryDTO save(CategoryDTO product);
    void delete(Long id);
}
