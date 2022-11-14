package edu.miu.springdatademo.service.impl;

import edu.miu.springdatademo.model.uniDirectional.Address;
import edu.miu.springdatademo.repository.AddressRepository;
import edu.miu.springdatademo.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public List<Address> findAll() {
        return (List<Address>) addressRepository.findAll();
    }

    @Override
    public void save(Address address) {
        addressRepository.save(address);
    }


    @Override
    public void delete(int id) {
        addressRepository.deleteById(id);
    }
}
