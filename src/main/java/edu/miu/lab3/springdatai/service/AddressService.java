package edu.miu.lab3.springdatai.service;

import edu.miu.lab3.springdatai.dto.RequestAddressDTO;
import edu.miu.lab3.springdatai.entity.bi.Address;

import java.util.List;

/**
 * Author: Kuylim TITH
 * Date: 11/3/2022
 */
public interface AddressService {

    RequestAddressDTO save(RequestAddressDTO address);

    RequestAddressDTO update(Long id, RequestAddressDTO address);

    List<Address> getAllAddress();

    Boolean deleteAddress(Long id);
}
