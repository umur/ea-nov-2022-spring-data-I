package com.springdata_i.lab3.service;

import com.springdata_i.lab3.entity.Address;
import com.springdata_i.lab3.entity.User;

public interface AddressService {
    Address getAddress();
    Address addAddress(Address address);
    Address updateAddress(Address address);
    Address deleteAddress(Address address);
}
