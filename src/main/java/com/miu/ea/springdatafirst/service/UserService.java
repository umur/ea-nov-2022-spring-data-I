package com.miu.ea.springdatafirst.service;

import com.miu.ea.springdatafirst.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void addUser(User user);

    User getById(Long id) throws Exception;

    void updateUser(User user, Long id) throws Exception;
}
