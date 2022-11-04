package edu.miu.lab3.springdatai.dto;

import lombok.Data;

/**
 * Author: Kuylim TITH
 * Date: 11/3/2022
 */
@Data
public class RequestUserDTO {

    private String email;
    private String password;
    private String firstname;
    private String lastname;
    private Long addressId;
}
