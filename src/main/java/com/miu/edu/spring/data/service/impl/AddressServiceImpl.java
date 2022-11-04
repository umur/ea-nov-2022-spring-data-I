package com.miu.edu.spring.data.service.impl;

import com.miu.edu.spring.data.dto.AddressDto;
import com.miu.edu.spring.data.entity.User;
import com.miu.edu.spring.data.repository.AddressRepository;
import com.miu.edu.spring.data.repository.UserRepository;
import com.miu.edu.spring.data.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    AddressRepository addressRepository;

    @Autowired
    UserRepository userRepository;

    @Override
    public List<AddressDto> getAllAddresses() {
        return addressRepository.findAll().stream().map(AddressDto::convertFrom).toList();
    }

    @Override
    public AddressDto getAddressById(int id) {
        return AddressDto.convertFrom(addressRepository.findById(id).orElse(null));
    }

    @Override
    public AddressDto getAddressByUserId(int userId) {
        return AddressDto.convertFrom(addressRepository.getByUserId(userId));
    }

    @Override
    public void updateAddress(AddressDto address) {
        addressRepository.findById(address.getId()).ifPresent(a -> {
            a.setCity(address.getCity());
            a.setStreet(address.getStreet());
            a.setZip(address.getZip());
            addressRepository.save(a);
        });

    }

    @Override
    public void addAddress(AddressDto address) {
        addressRepository.save(AddressDto.convertTo(address));
    }

    @Override
    public void removeById(int id) {
        User user = userRepository.findByAddressId(id);
        if (user != null) {
            user.setAddress(null);
        }
        addressRepository.deleteById(id);
    }
}
