package com.example.spring_data.repository;

import com.example.spring_data.entity.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryRepo extends CrudRepository<Category,Integer> {
}
