package lab3.repository;

import lab3.models.unidirectional.UniCategory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends CrudRepository<UniCategory, String> {
    List<UniCategory> findAll();
}
