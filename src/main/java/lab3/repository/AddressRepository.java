package lab3.repository;

import lab3.models.unidirectional.UniAddress;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepository extends CrudRepository<UniAddress, String> {
    List<UniAddress> findAll();
}
