package com.springdata.springdatabidirectional.controller;

import com.springdata.springdatabidirectional.entity.User;
import com.springdata.springdatabidirectional.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping
    public List<User> getAddress(){
        return userService.getAll();
    }
    @PostMapping("/save")
    public User saveAddress(@RequestBody User user){
        return userService.save(user);
    }
    @GetMapping("/{id}")
    public User getAddressById(@PathVariable Long id){
        return userService.getById(id);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteUserById(@PathVariable Long id){
        userService.deleteUser(id);
    }
}
