package com.example.springdataI.repository;

import com.example.springdataI.entity.Address;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo extends CrudRepository<Address,Integer> {
    @Query("SELECT a FROM Address a WHERE a.id = ?1")
    Address findAddressById(Integer id);
}
