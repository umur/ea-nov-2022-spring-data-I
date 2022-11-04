package lab3.repository;

import lab3.models.unidirectional.UniUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<UniUser, String> {
    List<UniUser> findAll();
}
