package com.example.springdata.services.impl;

import com.example.springdata.entities.Address;
import com.example.springdata.entities.DTOs.AddressDTO;
import com.example.springdata.repositories.AddressRepo;
import com.example.springdata.services.AddressService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    AddressRepo addressRepo;

    ModelMapper modelMapper = new ModelMapper();

    @Override
    public AddressDTO create(AddressDTO addressDTO) {
        Address address = modelMapper.map(addressDTO, Address.class);
        Address add = addressRepo.save(address);
        return modelMapper.map(add, AddressDTO.class);
    }

    @Override
    public List<AddressDTO> getAll() {
        return null;
    }

    @Override
    public AddressDTO update(Long id, AddressDTO addressDTO) {
        return null;
    }

    @Override
    public String delete(Long id) {
        return null;
    }
}
