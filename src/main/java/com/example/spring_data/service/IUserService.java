package com.example.spring_data.service;

import com.example.spring_data.dto.UserDto;

import java.util.List;

public interface IUserService {
    List<UserDto> findAll ();

    UserDto findUsersById (Integer id);

    void createUsers (UserDto usersDto);

    void deleteUsers (Integer id);

    void updateUsers (Integer id,String email,String firstname,String lastname);
}
