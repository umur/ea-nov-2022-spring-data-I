package com.example.Assignment3.repo;

import com.example.Assignment3.entity.unidirectional.Category;
import com.example.Assignment3.entity.unidirectional.Product;
import com.example.Assignment3.entity.unidirectional.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepo extends CrudRepository<Category, Integer> {

    List<Category> findAllById(int id);

}
