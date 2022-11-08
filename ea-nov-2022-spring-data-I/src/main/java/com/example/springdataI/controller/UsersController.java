package com.example.springdataI.controller;

import com.example.springdataI.dto.UsersDto;
import com.example.springdataI.entity.Users;
import com.example.springdataI.service.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UsersController {

    private final UsersService usersService;

    @GetMapping
    public List <UsersDto> getUsers(){
        return usersService.findAll ();
    }

    @GetMapping(path = "/{id}")
    public UsersDto getUsersById(@PathVariable("id") Integer id){
        return usersService.findUsersById (id);

    }

    @PostMapping()
    public void create(@RequestBody UsersDto usersDto){
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
