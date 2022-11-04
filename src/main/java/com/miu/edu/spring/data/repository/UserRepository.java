package com.miu.edu.spring.data.repository;

import com.miu.edu.spring.data.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

    List<User> findAll();

    User findByAddressId(int addressId);
}
