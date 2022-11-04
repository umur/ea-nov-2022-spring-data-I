package com.springdata.springdatabidirectional.DTOs;

import com.springdata.springdatabidirectional.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.OneToOne;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressDTO {
    private Long id;
    private String street;
    private int zip;
    private String city;
}
