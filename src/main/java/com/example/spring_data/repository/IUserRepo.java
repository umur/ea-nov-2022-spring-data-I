package com.example.spring_data.repository;

import com.example.spring_data.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUserRepo extends CrudRepository<User,Integer> {
    Optional<User> findByEmail(String email);
}
