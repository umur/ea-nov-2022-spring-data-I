package com.springdata_i.lab3.service.Impl;

import com.springdata_i.lab3.entity.Address;
import com.springdata_i.lab3.repository.AddressRepository;
import com.springdata_i.lab3.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;

public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressRepository  addressRepository;
    @Override
    public Address getAddress() {
        return (Address) addressRepository.findAll();
    }

    @Override
    public Address addAddress(Address address) {
        return null;
    }

    @Override
    public Address updateAddress(Address address) {
        return null;
    }

    @Override
    public Address deleteAddress(Address address) {
        return null;
    }
}
