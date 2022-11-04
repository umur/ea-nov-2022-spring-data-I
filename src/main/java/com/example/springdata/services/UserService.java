package com.example.springdata.services;

import com.example.springdata.entities.DTOs.UserDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public UserDTO create(UserDTO userDTO);

    public List<UserDTO> getAll();

    UserDTO find(Long id);

    public UserDTO update(Long id, UserDTO userDTO);

    public UserDTO delete(Long id);
}
