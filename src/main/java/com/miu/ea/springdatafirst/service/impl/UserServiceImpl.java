package com.miu.ea.springdatafirst.service.impl;

import com.miu.ea.springdatafirst.entity.User;
import com.miu.ea.springdatafirst.repository.UserRepository;
import com.miu.ea.springdatafirst.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }

    @Override
    public User getById(Long id) throws Exception {
      return userRepository.findById(id).orElseThrow(()->new Exception("User not found"));
    }

    @Override
    public void updateUser(User user, Long id) throws Exception {
        User userToUpdate = getById(id);
        userToUpdate = user;
        userRepository.save(userToUpdate);
    }
}
