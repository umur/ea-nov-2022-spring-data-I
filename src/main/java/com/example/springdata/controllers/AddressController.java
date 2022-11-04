package com.example.springdata.controllers;

import com.example.springdata.entities.DTOs.AddressDTO;
import com.example.springdata.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")

public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody AddressDTO addressDTO) {
        return new ResponseEntity<>(addressService.create(addressDTO), HttpStatus.OK);
    }
}
