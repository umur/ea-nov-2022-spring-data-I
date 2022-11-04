package edu.miu.eanov2022springdataI.service.impl;

import edu.miu.eanov2022springdataI.model.Address;
import edu.miu.eanov2022springdataI.repository.AddressRepository;
import edu.miu.eanov2022springdataI.service.AddressService;
import org.hibernate.sql.Update;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressRepository addressRepo;

    @Override
    public List<Address> getAll() {
        return addressRepo.findAll();
    }

    @Override
    public Address getById(long id) {
        return addressRepo.getReferenceById(id);
    }

    @Override
    public Address add(Address address) {
        return addressRepo.save(address);
    }

    @Override
    public Address updateById(long id, Address address) {
        Address newAddress = new Address();
        newAddress.setCity(address.getCity());
        newAddress.setZip(address.getZip());
        newAddress.setUser(address.getUser());
        newAddress.setStreet(address.getStreet());
        return newAddress;
    }

    @Override
    public void deleteById(long id) {
        addressRepo.deleteById(id);
    }
}
