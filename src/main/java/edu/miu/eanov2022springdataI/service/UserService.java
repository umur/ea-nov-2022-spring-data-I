package edu.miu.eanov2022springdataI.service;

import edu.miu.eanov2022springdataI.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    public List<User> getAll();
    public Optional<User> getById(long id);
    public User add(User user);
    public User updateById(long id, User user);
    public void deleteById(long id);
}
