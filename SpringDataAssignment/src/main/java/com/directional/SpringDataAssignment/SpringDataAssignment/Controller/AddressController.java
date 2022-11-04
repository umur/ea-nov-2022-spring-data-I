package com.directional.SpringDataAssignment.SpringDataAssignment.Controller;

import com.directional.SpringDataAssignment.SpringDataAssignment.Entity.UniDirectional.Address;
import com.directional.SpringDataAssignment.SpringDataAssignment.Service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/address")
public class AddressController {

    public final AddressService addressService;

    public void getById(@PathVariable Long id) {
        addressService.get(id);
    }

    @GetMapping
    public List<Address> GetAll() {
       return addressService.getAll();
    }

    @PostMapping
    public void add(@RequestBody Address address) {
        addressService.saveOrUpdate(address);
    }

    @PutMapping
    public void update(@RequestBody Address address) {
        addressService.saveOrUpdate(address);
    }

    @DeleteMapping
    public void delete(@PathVariable Long id) {
        addressService.delete(id);
    }


}
