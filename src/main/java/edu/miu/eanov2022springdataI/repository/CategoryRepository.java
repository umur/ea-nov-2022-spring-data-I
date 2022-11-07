package edu.miu.eanov2022springdataI.repository;

import edu.miu.eanov2022springdataI.model.Category;
import edu.miu.eanov2022springdataI.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    List<Category> findAll();

    Category getReferenceById(Long id);
}
