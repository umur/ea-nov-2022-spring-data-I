package com.example.springdata.repositories;

import com.example.springdata.entities.DTOs.UserDTO;
import com.example.springdata.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
}
