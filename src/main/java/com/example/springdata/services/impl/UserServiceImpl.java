package com.example.springdata.services.impl;

import com.example.springdata.entities.DTOs.UserDTO;
import com.example.springdata.entities.User;
import com.example.springdata.repositories.UserRepo;
import com.example.springdata.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public UserDTO create(UserDTO userDTO) {
        User user = modelMapper.map(userDTO, User.class);
        return modelMapper.map(userRepo.save(user), UserDTO.class);
    }

    @Override
    public List<UserDTO> getAll() {
        return userRepo.findAll().stream().map(u -> modelMapper.map(u, UserDTO.class)).collect(Collectors.toList());
    }

    @Override
    public UserDTO find(Long id) {
        return modelMapper.map(userRepo.findById(id), UserDTO.class);
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
