package edu.miu.lab3.service.impl;

import edu.miu.lab3.entity.Address;
import edu.miu.lab3.repository.AddressRepo;
import edu.miu.lab3.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {

    private final AddressRepo addressRepo;

    @Override
    public void save(Address address) {
        addressRepo.save(address);
    }

    @Override
    public void delete(Long addressId) {
        addressRepo.deleteById(addressId);
    }

    @Override
    public Address getById(Long addressId) {
        return addressRepo.findById(addressId).get();
    }

    @Override
    public List<Address> getAll() {
        var addressList = new ArrayList<Address>();
        addressRepo.findAll().forEach(addressList::add);

        return addressList;
    }
}
