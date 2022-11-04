package miu.edu.ealab3springdata1.service.impl;

import miu.edu.ealab3springdata1.entity.bidirectional.Address;
import miu.edu.ealab3springdata1.repository.AddressRepo;
import miu.edu.ealab3springdata1.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressRepo repo;
    @Override
    public List<Address> findAll() {
        return (List<Address>) repo.findAll();
    }

    @Override
    public Optional<Address> findOne(Long id) {
        return repo.findById(id);
    }

    @Override
    public Address save(Address review) {
        return repo.save(review);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }

}
