package com.miu.ea.springdatafirst.controller;

import com.miu.ea.springdatafirst.entity.User;
import com.miu.ea.springdatafirst.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {

    private UserService userService;

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @GetMapping("/retrieve/{id}")
    public User getById(@PathVariable Long id) throws Exception {
        return userService.getById(id);
    }

    @PutMapping("/{id}")
    public void updateUser(@RequestBody User user, @PathVariable Long id) throws Exception {
        userService.updateUser(user, id);
    }
}
