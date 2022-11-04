package edu.miu.lab3.service;

import edu.miu.lab3.entity.Address;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AddressService {

    void save(Address address);

    void delete(Long addressId);

    Address getById(Long addressId);

    List<Address> getAll();

}
