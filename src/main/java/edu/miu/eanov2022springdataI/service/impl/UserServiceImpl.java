package edu.miu.eanov2022springdataI.service.impl;

import edu.miu.eanov2022springdataI.model.User;
import edu.miu.eanov2022springdataI.repository.UserRepository;
import edu.miu.eanov2022springdataI.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepo;

    @Override
    public List<User> getAll() {
        return userRepo.findAll();
    }

    @Override
    public User getById(long id) {
        return userRepo.getReferenceById(id);
    }

    @Override
    public User add(User user) {
        return userRepo.save(user);
    }

    @Override
    public User updateById(long id, User user) {
        User newUser = userRepo.getReferenceById(id);
        newUser.setAddress(user.getAddress());
        newUser.setEmail(user.getEmail());
        newUser.setPassword(user.getPassword());
        newUser.setReviews(user.getReviews());
        newUser.setFirstName(user.getFirstName());
        newUser.setLastName(user.getLastName());
        return userRepo.save(newUser);
    }

    @Override
    public void deleteById(long id) {
        userRepo.deleteById(id);
    }
}
