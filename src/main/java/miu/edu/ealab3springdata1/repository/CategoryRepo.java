package miu.edu.ealab3springdata1.repository;

import miu.edu.ealab3springdata1.entity.bidirectional.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Long> {
}
