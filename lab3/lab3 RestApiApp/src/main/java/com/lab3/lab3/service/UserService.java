package com.lab3.lab3.service;

import com.lab3.lab3.entity.Users;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    String saveUser(Users user);
    String deleteUser(long id);
    List<Users> getAllUsers();
    Users getUserByID(long id);
}
