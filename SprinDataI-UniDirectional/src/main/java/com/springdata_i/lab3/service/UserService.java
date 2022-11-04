package com.springdata_i.lab3.service;

import com.springdata_i.lab3.entity.User;

public interface UserService {
    User getUser();
    User addUser(User user);
    User updateUser(User user);
    User deleteUser(User user);
}
