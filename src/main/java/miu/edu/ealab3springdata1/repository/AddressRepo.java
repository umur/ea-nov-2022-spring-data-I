package miu.edu.ealab3springdata1.repository;

import miu.edu.ealab3springdata1.entity.bidirectional.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo extends JpaRepository<Address, Long> {
}
