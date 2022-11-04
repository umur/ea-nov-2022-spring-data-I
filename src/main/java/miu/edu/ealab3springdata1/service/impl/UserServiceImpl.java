package miu.edu.ealab3springdata1.service.impl;

import miu.edu.ealab3springdata1.entity.bidirectional.User;
import miu.edu.ealab3springdata1.repository.UserRepo;
import miu.edu.ealab3springdata1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo repo;
    @Override
    public List<User> findAll() {
        return (List<User>) repo.findAll();
    }

    @Override
    public Optional<User> findOne(Long id) {
        return repo.findById(id);
    }

    @Override
    public User save(User review) {
        return repo.save(review);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }

}
