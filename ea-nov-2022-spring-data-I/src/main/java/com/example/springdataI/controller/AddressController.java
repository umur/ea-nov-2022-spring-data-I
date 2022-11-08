package com.example.springdataI.controller;

import com.example.springdataI.dto.AddressDto;
import com.example.springdataI.entity.Address;
import com.example.springdataI.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/addresses")
public class AddressController {
    private final AddressService addressService;

    @GetMapping
    public List <AddressDto> getAddresses (){
        return addressService.findAll ();
    }

    @GetMapping(path = "/{id}")
    public AddressDto getAddressById(@PathVariable("id") Integer id){
        return addressService.findAddressById (id);

    }

    @PostMapping
    public void create(@RequestBody AddressDto addressDto){
        addressService.create (addressDto);
    }

    @PutMapping(path = "/{id}")
    public void update(@PathVariable("id") Integer id,
                       @RequestParam(required = false) String street,
                       @RequestParam(required = false) String zip,
                       @RequestParam(required = false) String city){
        addressService.update (id,street,zip,city);
    }

    @DeleteMapping(path = "/{id}")
    public void delete(@PathVariable("id") Integer id){
        addressService.delete(id);

    }
}
