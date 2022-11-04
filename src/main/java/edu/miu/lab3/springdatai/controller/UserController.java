package edu.miu.lab3.springdatai.controller;

import edu.miu.lab3.springdatai.dto.RequestUserDTO;
import edu.miu.lab3.springdatai.entity.bi.User;
import edu.miu.lab3.springdatai.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Author: Kuylim TITH
 * Date: 11/3/2022
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService service;

    @PostMapping
    public RequestUserDTO createUser(@RequestBody RequestUserDTO dto) {
        return service.save(dto);
    }

    @PutMapping("/{id}")
    public RequestUserDTO updateUser(@PathVariable Long id, @RequestBody RequestUserDTO dto) {
        return service.update(id, dto);
    }

    @GetMapping
    public List<User> getAllUser() {
        return service.getAllUser();
    }

    @DeleteMapping("/{id}")
    public Boolean deleteUser(@PathVariable Long id) {
        return service.deleteUser(id);
    }
}
