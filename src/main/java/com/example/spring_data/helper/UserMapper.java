package com.example.spring_data.helper;

import com.example.spring_data.dto.UserDto;
import com.example.spring_data.entity.User;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class UserMapper {
    private final ModelMapper modelMapper;

    public UserDto toDto(User users) {
        return modelMapper.map(users, UserDto.class);
    }

    public List <UserDto> toDtos(List<User> users) {
        return users.stream()
                .map(this::toDto)
                .toList();
    }

    public User toEntity(UserDto usersDto) {
        return modelMapper.map(usersDto, User.class);
    }

    public List<User> toEntities(List<UserDto> usersDtos) {
        return usersDtos.stream()
                .map(this::toEntity)
                .toList();
    }
}