package com.lab3.lab3.repository;

import com.lab3.lab3.entity.Users;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<Users,Long> {
}
