package com.example.spring_data.controller;


import com.example.spring_data.dto.UserDto;
import com.example.spring_data.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final IUserService usersService;

    @GetMapping
    public List<UserDto> getUsers(){
        return usersService.findAll ();
    }

    @GetMapping(path = "/{id}")
    public UserDto getUsersById(@PathVariable("id") Integer id){
        return usersService.findUsersById (id);

    }

    @PostMapping()
    public void create(@RequestBody UserDto usersDto){
        usersService.createUsers(usersDto);
    }

    @PutMapping(path = "/{id}")
    public void update(@PathVariable("id") Integer id,
                       @RequestParam(required = false) String email,
                       @RequestParam(required = false) String firstname,
                       @RequestParam(required = false) String lastname){
        usersService.updateUsers (id,email,firstname,lastname);
    }

    @DeleteMapping(path = "/{id}")
    public void delete(@PathVariable("id") Integer id){
        usersService.deleteUsers(id);

    }
}