package com.example.spring_data.service.impl;

import com.example.spring_data.dto.AddressDto;
import com.example.spring_data.entity.Address;
import com.example.spring_data.helper.AddressMapper;
import com.example.spring_data.repository.IAddressRepo;
import com.example.spring_data.service.IAddressService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@AllArgsConstructor
public class AddressServiceImpl implements IAddressService {
    @Autowired
    IAddressRepo addressRepo;
    private final AddressMapper addressMapper;

    @Transactional
    @Override
    public List<AddressDto> findAll () {
        return addressMapper.toDtos ((List <Address>) addressRepo.findAll ());
    }

    @Transactional
    @Override
    public  AddressDto findAddressById (Integer id) {
        return addressMapper.toDto (addressRepo.findById (id).orElse(new Address()));
    }

    @Transactional
    @Override
    public void create (AddressDto addressDto) {
        addressRepo.save (addressMapper.toEntity (addressDto));

    }

    @Override
    public void delete (Integer id) {
        boolean exists = addressRepo.existsById (id);
        if(!exists){
            throw new IllegalStateException ("Address id:"+id+"does not exist");
        }
        addressRepo.deleteById (id);

    }

    @Transactional
    @Override
    public void update(Integer id,String street,Integer zipcode,String city) {
        Address address = addressRepo.findById (id)
                .orElseThrow (()->new IllegalStateException (
                        "Address not found"));

        if(street !=null &&street.length ()>0 ){
            address.setStreet (street);
        }
        if(zipcode !=null &&zipcode >0 ){
            address.setZip (zipcode);
        }
        if(city !=null &&city.length ()>0 ){
            address.setCity (city);
        }
    }
}