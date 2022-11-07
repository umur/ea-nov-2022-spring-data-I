package edu.miu.eanov2022springdataI.repository;

import edu.miu.eanov2022springdataI.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findAll();

    User getReferenceById(Long id);



}
