package com.AssignmentThree.Service.Implemintation;

import com.AssignmentThree.Entities.Users;
import com.AssignmentThree.Reposotory.UserRepo;
import com.AssignmentThree.Service.UsersService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    UserRepo userRepo;

    @Override
    public void add(Users user){
        userRepo.save(user);
    }

    @Override
    public List<Users> getAll(){
        return userRepo.findAll();
    }

    @Override
    public Optional<Users> findById(Integer userID){
        return userRepo.findById(userID);
    }


}
