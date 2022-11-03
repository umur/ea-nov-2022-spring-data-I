package com.example.Assignment3.repo;

import com.example.Assignment3.entity.unidirectional.Address;
import com.example.Assignment3.entity.unidirectional.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepo extends CrudRepository<Address, Integer> {

    List<Address> findAllByCityContains(String city);

}
