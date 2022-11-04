package edu.miu.lab3.springdatai.repository;

import edu.miu.lab3.springdatai.entity.bi.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Author: Kuylim TITH
 * Date: 11/3/2022
 */
@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
