package edu.miu.lab3.springdatai.service;

import edu.miu.lab3.springdatai.dto.RequestCategoryDTO;
import edu.miu.lab3.springdatai.entity.bi.Category;

import java.util.List;

/**
 * Author: Kuylim TITH
 * Date: 11/3/2022
 */
public interface CategoryService {

    RequestCategoryDTO save(RequestCategoryDTO category);

    RequestCategoryDTO update(Long id, RequestCategoryDTO category);

    List<Category> getAllCategory();

    Boolean deleteCategory(Long id);
}
