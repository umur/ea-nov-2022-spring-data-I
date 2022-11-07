package com.example.spring_data.service.impl;

import com.example.spring_data.dto.UserDto;
import com.example.spring_data.entity.User;
import com.example.spring_data.helper.UserMapper;
import com.example.spring_data.repository.IUserRepo;
import com.example.spring_data.service.IUserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements IUserService {
    @Autowired
    IUserRepo usersRepo;
    private final UserMapper usersMapper;

    @Override
    @Transactional
    public List<UserDto> findAll () {
        return usersMapper.toDtos ((List <User>) usersRepo.findAll ());
    }

    @Override
    @Transactional
    public UserDto findUsersById (Integer id) {
        return usersMapper.toDto (usersRepo.findById (id).orElse(new User()));
    }

    @Override
    @Transactional
    public void createUsers (UserDto userDto) {
        User user = usersMapper.toEntity (userDto);
        usersRepo.save (user);
    }

    @Override
    public void deleteUsers (Integer id) {
        boolean exists = usersRepo.existsById (id);
        if(!exists){
            throw new IllegalStateException ("User not found");
        }
        usersRepo.deleteById (id);

    }

    @Override
    @Transactional
    public void updateUsers (Integer id,String email,String firstname,String lastname) {
        User user = usersRepo.findById (id)
                .orElseThrow (()->new IllegalStateException (
                        "User not found"));

            user.setEmail (email);

        if(firstname !=null &&firstname.length ()>0){
            user.setFirstName(firstname);
        }

        if(lastname !=null &&lastname.length ()>0 ){
            user.setLastName(lastname);
        }
    }

}
