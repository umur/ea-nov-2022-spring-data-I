package com.example.EA.Lab3.Repo;

import com.example.EA.Lab3.DTO.ProductDTO;
import com.example.EA.Lab3.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {
    List<ProductDTO> findAllMinPrice(Long minPrice);
    List<ProductDTO> findAllMaxPrice(Long maxPrice);
    List<ProductDTO> findAllContainsKey(String keyword);
}
