package edu.miu.springdatademo.service;

import edu.miu.springdatademo.model.uniDirectional.Address;


public interface AddressService {
    public Iterable<Address> findAll();

    public void save(Address address);


    public void delete(int id);
}
