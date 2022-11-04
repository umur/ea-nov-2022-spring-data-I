package com.example.springdata.services;

import com.example.springdata.entities.DTOs.AddressDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AddressService {

    public AddressDTO create(AddressDTO addressDTO);

    public List<AddressDTO> getAll();

    public AddressDTO update(Long id, AddressDTO addressDTO);

    public String delete(Long id);
}
