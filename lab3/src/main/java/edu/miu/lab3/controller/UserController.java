package edu.miu.lab3.controller;

import edu.miu.lab3.entity.User;
import edu.miu.lab3.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/lab3/user")
public class UserController {

    private final UserService userService;

    @PostMapping
    public String create(@RequestBody User user) {
        try {
            userService.save(user);

            return "User saved successfully.";
        }
        catch (Exception e) {
            e.printStackTrace();
            return "Error occurred while saving User.";
        }
    }

    @PutMapping
    public String update(@RequestBody User user) {
        try {
            userService.save(user);

            return "User updated successfully.";
        }
        catch (Exception e) {
            e.printStackTrace();
            return "Error occurred while updating User.";
        }
    }

    @DeleteMapping("/{userId}")
    public String delete(@PathVariable Long userId) {
        try {
            userService.delete(userId);

            return "User deleted successfully.";
        }
        catch (Exception e) {
            e.printStackTrace();
            return "Error occurred while deleting User.";
        }
    }

    @GetMapping
    public List<User> getAll() {
        return userService.getAll();
    }

    @GetMapping("/{userId}")
    public User getById(@PathVariable Long userId) {
        return userService.getById(userId);
    }

}
