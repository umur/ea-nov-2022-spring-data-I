package com.springdata.springdatabidirectional.service;


import com.springdata.springdatabidirectional.entity.Address;

import java.util.List;

public interface AddressService {

    Address save(Address address);
    Address updateAddress(Address address);
    Address getById(Long id);
    void deleteAddress(Long id);
    List<Address> getAll();
}
