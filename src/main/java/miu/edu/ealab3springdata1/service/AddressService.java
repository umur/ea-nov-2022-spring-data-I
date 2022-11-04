package miu.edu.ealab3springdata1.service;

import miu.edu.ealab3springdata1.entity.bidirectional.Address;


import java.util.List;
import java.util.Optional;

public interface AddressService {
    List<Address> findAll();
    Optional<Address> findOne(Long id);
    Address save(Address address);
    void delete(Long id);
}
