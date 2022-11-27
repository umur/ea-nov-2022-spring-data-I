package com.lab3.lab3.controller;

import com.lab3.lab3.entity.Users;
import com.lab3.lab3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public String saveUser(@RequestBody Users user){
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public Users getUserById(@PathVariable long id){
        return userService.getUserByID(id);
    }

    @GetMapping
    public List<Users> getAllUsers(){
        return userService.getAllUsers();
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable long id){
        return userService.deleteUser(id);
    }
}
