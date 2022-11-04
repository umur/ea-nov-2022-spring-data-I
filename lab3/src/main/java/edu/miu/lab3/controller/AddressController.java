package edu.miu.lab3.controller;

import edu.miu.lab3.entity.Address;
import edu.miu.lab3.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/lab3/address")
public class AddressController {

    private final AddressService addressService;

    @PostMapping
    public String create(@RequestBody Address address) {
        try {
            addressService.save(address);

            return "Address saved successfully.";
        }
        catch (Exception e) {
            e.printStackTrace();
            return "Error occurred while saving Address.";
        }
    }

    @PutMapping
    public String update(@RequestBody Address address) {
        try {
            addressService.save(address);

            return "Address updated successfully.";
        }
        catch (Exception e) {
            e.printStackTrace();
            return "Error occurred while updating Address.";
        }
    }

    @DeleteMapping("/{addressId}")
    public String delete(@PathVariable Long addressId) {
        try {
            addressService.delete(addressId);

            return "Address deleted successfully.";
        }
        catch (Exception e) {
            e.printStackTrace();
            return "Error occurred while deleting Address.";
        }
    }

    @GetMapping
    public List<Address> getAll() {
        return addressService.getAll();
    }

    @GetMapping("/{addressId}")
    public Address getById(@PathVariable Long addressId) {
        return addressService.getById(addressId);
    }

}
