package com.example.lab3springdata.repo;

import com.example.lab3springdata.model.uni_directional.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CategoryRepository extends CrudRepository<Category,Integer> {
}
