package com.AssignmentThree.Controller;


import com.AssignmentThree.Entities.Addresses;
import com.AssignmentThree.Service.Implemintation.AddressServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("address")
@RestController
public class AddressController {

    @Autowired
    AddressServiceImpl addressService;


    @GetMapping("findall")
    public List<Addresses> findAll(){
        return addressService.getAll();
    }

    @DeleteMapping("deletebyid")
    void delete(int addressId){
        addressService.delete(addressId);
    }
}
