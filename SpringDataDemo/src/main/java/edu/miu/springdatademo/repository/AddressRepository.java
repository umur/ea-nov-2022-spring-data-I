package edu.miu.springdatademo.repository;

import edu.miu.springdatademo.model.uniDirectional.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository<Address, Integer> {
}
