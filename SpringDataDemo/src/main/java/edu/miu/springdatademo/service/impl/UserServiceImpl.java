package edu.miu.springdatademo.service.impl;

import edu.miu.springdatademo.model.uniDirectional.Address;
import edu.miu.springdatademo.model.uniDirectional.User;
import edu.miu.springdatademo.repository.AddressRepository;
import edu.miu.springdatademo.repository.UserRepository;
import edu.miu.springdatademo.service.AddressService;
import edu.miu.springdatademo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return (List<User>) userRepository.findAll();
    }


    @Override
    public void save(User user) {
        userRepository.save(user);
    }


    @Override
    public void delete(int id) {
        userRepository.deleteById(id);
    }
}
