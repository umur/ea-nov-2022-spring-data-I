package com.example.productreviewapplication.service;

import com.example.productreviewapplication.model.Address;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AddressService {
    public void addAddress(Address address);
    public Address updateAddress(Integer id, String streetName);
    public void deleteAddress(Integer id);
    public Iterable<Address> getAllAddresses();
    public Address getAddressById(Integer id);
}
