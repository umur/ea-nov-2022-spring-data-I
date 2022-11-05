package com.example.springdataI.service;

import com.example.springdataI.dto.AddressDto;
import com.example.springdataI.entity.Address;

import java.util.List;

public interface AddressService {
    public List <AddressDto> findAll ();

    public AddressDto findAddressById (Integer id);

    void create (AddressDto addressDto);

    void delete (Integer id);

    void update(Integer id,String street,String zipcode,String city);
}
