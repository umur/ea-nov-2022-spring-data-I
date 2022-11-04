package com.miu.edu.spring.data.service.impl;

import com.miu.edu.spring.data.dto.UserDto;
import com.miu.edu.spring.data.repository.UserRepository;
import com.miu.edu.spring.data.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserDto> getAllUsers() {
        return userRepository.findAll().stream().map(UserDto::convertFrom).toList();
    }

    @Override
    public UserDto getUserById(int id) {
        return UserDto.convertFrom(userRepository.findById(id).orElse(null));
    }

    @Override
    public void updateUser(UserDto user) {
        userRepository.findById(user.getId()).ifPresent(u -> {
            u.setFirstName(user.getFirstName());
            u.setLastname(user.getLastname());
            u.setPassword(user.getPassword());
            u.setEmail(user.getEmail());
            userRepository.save(u);
        });
    }

    @Override
    public void addUser(UserDto user) {
        userRepository.save(UserDto.convertTo(user));
    }

    @Override
    public void removeById(int id) {
        userRepository.deleteById(id);
    }
}
