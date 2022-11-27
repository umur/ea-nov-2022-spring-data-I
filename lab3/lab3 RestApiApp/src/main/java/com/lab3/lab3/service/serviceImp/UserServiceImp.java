package com.lab3.lab3.service.serviceImp;

import com.lab3.lab3.entity.Users;
import com.lab3.lab3.repository.UserRepo;
import com.lab3.lab3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserRepo userRepo;
    @Override
    public String saveUser(Users user) {
       userRepo.save(user);
       return "user saved successfully";
    }

    @Override
    public String deleteUser(long id) {
        userRepo.deleteById(id);
        return "user deleted successfully";
    }

    @Override
    public List<Users> getAllUsers() {
        List<Users> temp=new ArrayList<>();
        userRepo.findAll().forEach(temp::add);
        return temp;
    }

    @Override
    public Users getUserByID(long id) {
        return userRepo.findById(id).get();
    }
}
