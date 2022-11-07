package edu.miu.eanov2022springdataI.repository;

import edu.miu.eanov2022springdataI.model.Product;
import edu.miu.eanov2022springdataI.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAll();

    Product getReferenceById(Long id);
}
