package com.example.springdata.services.impl;

import com.example.springdata.entities.DTOs.UserDTO;
import com.example.springdata.entities.User;
import com.example.springdata.repositories.UserRepo;
import com.example.springdata.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;

    ModelMapper modelMapper = new ModelMapper();

    @Override
    public UserDTO create(UserDTO userDTO) {
        User user = modelMapper.map(userDTO, User.class);
        User us = userRepo.save(user);
        return modelMapper.map(us, UserDTO.class);
    }

    @Override
    public List<UserDTO> getAll() {
        List<User> users = new ArrayList<>();
        return userRepo.findAll().stream().map(u-> modelMapper.map(u, UserDTO.class)).collect(Collectors.toList());
//        return users.stream().map(u -> modelMapper.map(u, UserDTO.class)).collect(Collectors.toList());
    }

    @Override
    public UserDTO update(Long id, UserDTO userDTO) {
        User user = userRepo.findById(id).orElseThrow(() -> new RuntimeException("User not found!!"));
        return modelMapper.map(userRepo.save(user), UserDTO.class);
    }

    @Override
    public UserDTO delete(Long id) {
        User user = userRepo.findById(id).orElseThrow(() -> new RuntimeException("User not found!!!"));
        userRepo.delete(user);
        return modelMapper.map(user, UserDTO.class);
    }
}
