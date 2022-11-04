package miu.edu.ealab3springdata1.service;

import miu.edu.ealab3springdata1.entity.bidirectional.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> findAll();
    Optional<User> findOne(Long id);
    User save(User review);
    void delete(Long id);


}
