package edu.miu.eanov2022springdataI.service;

import edu.miu.eanov2022springdataI.model.Address;
import org.hibernate.sql.Update;

import java.util.List;

public interface AddressService {
    public List<Address> getAll();
    public Address getById(long id);
    public Address add(Address address);
    public Address updateById(long id, Address address);
    public void deleteById(long id);
}
