package edu.miu.lab3.springdatai.service;

import edu.miu.lab3.springdatai.dto.RequestUserDTO;
import edu.miu.lab3.springdatai.entity.bi.User;

import java.util.List;

/**
 * Author: Kuylim TITH
 * Date: 11/3/2022
 */
public interface UserService {

    RequestUserDTO save(RequestUserDTO user);

    RequestUserDTO update(Long id, RequestUserDTO user);

    List<User> getAllUser();

    Boolean deleteUser(Long id);
}
