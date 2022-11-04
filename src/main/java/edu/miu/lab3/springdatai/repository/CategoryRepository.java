package edu.miu.lab3.springdatai.repository;

import edu.miu.lab3.springdatai.entity.bi.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Author: Kuylim TITH
 * Date: 11/3/2022
 */
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
