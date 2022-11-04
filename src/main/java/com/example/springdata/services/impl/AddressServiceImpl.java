package com.example.springdata.services.impl;

import com.example.springdata.entities.Address;
import com.example.springdata.entities.DTOs.AddressDTO;
import com.example.springdata.repositories.AddressRepo;
import com.example.springdata.services.AddressService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    AddressRepo addressRepo;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public AddressDTO create(AddressDTO addressDTO) {
        Address address = modelMapper.map(addressDTO, Address.class);
        return modelMapper.map(addressRepo.save(address), AddressDTO.class);
    }

    @Override
    public List<AddressDTO> getAll() {
        return addressRepo.findAll().stream().map(a -> modelMapper.map(a, AddressDTO.class)).collect(Collectors.toList());
    }

    @Override
    public AddressDTO find(Long id) {
        return modelMapper.map(addressRepo.findById(id), AddressDTO.class);
    }

    @Override
    public AddressDTO update(Long id, AddressDTO addressDTO) {
        Address address = addressRepo.findById(id).orElseThrow(() -> new RuntimeException("Address not found!!"));
        return modelMapper.map(addressRepo.save(address), AddressDTO.class);
    }

    @Override
    public AddressDTO delete(Long id) {
        Address address = addressRepo.findById(id).orElseThrow(() -> new RuntimeException("Address not found!!"));
        addressRepo.delete(address);
        return modelMapper.map(address, AddressDTO.class);
    }
}
