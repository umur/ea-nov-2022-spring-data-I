package com.springdata.springdatabidirectional.service.Impl;


import com.springdata.springdatabidirectional.entity.Address;
import com.springdata.springdatabidirectional.repository.AddressRepository;
import com.springdata.springdatabidirectional.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
@Service
@Transactional
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public Address save(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public Address updateAddress(Address address) {
        return null;
    }

    @Override
    public Address getById(Long id) {
        return addressRepository.findById(id).get();
    }

    @Override
    public void deleteAddress(Long id) {
         addressRepository.deleteById(id);
    }

    @Override
    public List<Address> getAll() {
        List<Address> list=new ArrayList<>();
         addressRepository.findAll().forEach(list::add);
        return list;
    }
}
