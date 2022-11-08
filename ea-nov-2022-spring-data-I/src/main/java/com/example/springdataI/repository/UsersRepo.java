package com.example.springdataI.repository;

import com.example.springdataI.dto.UsersDto;
import com.example.springdataI.entity.Users;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsersRepo extends CrudRepository<Users,Integer> {

    @Query("SELECT u FROM Users u WHERE u.id = ?1")
    Users findUsersById(Integer id);

    @Query("SELECT u FROM Users u WHERE u.email = ?1")
     Optional<Users> findUsersByEmail (String email);
}
