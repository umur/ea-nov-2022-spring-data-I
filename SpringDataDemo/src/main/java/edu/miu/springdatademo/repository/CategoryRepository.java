package edu.miu.springdatademo.repository;

import edu.miu.springdatademo.model.uniDirectional.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer> {
}
