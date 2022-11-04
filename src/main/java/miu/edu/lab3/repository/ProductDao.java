package miu.edu.lab3.repository;

import miu.edu.lab3.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDao {

    List<Product> findProductsByPriceGreaterThan(Double minPrice);


}

