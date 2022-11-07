package com.example.spring_data.service;

import com.example.spring_data.dto.AddressDto;

import java.util.List;

public interface IAddressService {
     List<AddressDto> findAll ();

     AddressDto findAddressById (Integer id);

    void create (AddressDto addressDto);

    void delete (Integer id);

    void update(Integer id,String street,Integer zipcode,String city);
}
