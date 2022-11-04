package com.miu.ea.springdatafirst.repository;

import com.miu.ea.springdatafirst.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
