package com.springdata.springdatabidirectional.controller;

import com.springdata.springdatabidirectional.DTOs.AddressDTO;
import com.springdata.springdatabidirectional.DTOs.ProductDTO;
import com.springdata.springdatabidirectional.entity.Address;
import com.springdata.springdatabidirectional.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("/address")
public class AddressController {
    @Autowired
    private AddressService addressService;
    @Autowired
    private ModelMapper modelMapper;

    @GetMapping
    public List<AddressDTO> getAddress() {
        return addressService.getAll().stream().map(address -> modelMapper.map(address, AddressDTO.class))
                .collect(Collectors.toList());
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public ResponseEntity<AddressDTO> saveAddress(@RequestBody AddressDTO addressDTO) {
        Address addressRequest = modelMapper.map(addressDTO, Address.class);
        Address address = addressService.save(addressRequest);
        AddressDTO addressResponse = modelMapper.map(address, AddressDTO.class);
        return new ResponseEntity<AddressDTO>(addressResponse, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AddressDTO> getAddressById(@PathVariable Long id) {
        Address address = addressService.getById(id);
        AddressDTO responseAddress = modelMapper.map(address, AddressDTO.class);
        return ResponseEntity.ok().body(responseAddress);
    }

    //    @DeleteMapping("/delete/{id}")
//    public void deleteAddressById(@PathVariable(name = "id") Long id){
//        addressService.deleteAddress(id);
//    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteAddressById(@PathVariable(name = "id") Long id) {
        addressService.deleteAddress(id);
        return new ResponseEntity("Successfully deleted",HttpStatus.OK);
    }
}
