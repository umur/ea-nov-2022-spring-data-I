package edu.miu.springdatademo.service;

import edu.miu.springdatademo.model.uniDirectional.User;

public interface UserService {
    public Iterable<User> findAll();

    public void save(User user);


    public void delete(int id);
}
