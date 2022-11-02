package miu.edu.jpa.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import miu.edu.jpa.model.Address;

@Data
@RequiredArgsConstructor
public class UserDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    private AddressDTO address;
}
