package miu.ea.assigment3.entity.DTOs;

import lombok.Data;

import java.util.List;


@Data

public class UserDto {
    private int id;
    private String email;
    private String firstName;
    private String lastName;
    private AddressDto address;
    private List<ReviewDto> reviews;
}
