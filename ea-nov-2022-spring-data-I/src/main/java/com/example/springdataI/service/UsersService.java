package com.example.springdataI.service;

import com.example.springdataI.dto.UsersDto;
import com.example.springdataI.entity.Users;

import java.util.List;
import java.util.Optional;

public interface UsersService {
    public List<UsersDto> findAll ();

    public UsersDto findUsersById (Integer id);

    void createUsers (UsersDto usersDto);

    void deleteUsers (Integer id);

    void updateUsers (Integer id,String email,String firstname,String lastname);
}
