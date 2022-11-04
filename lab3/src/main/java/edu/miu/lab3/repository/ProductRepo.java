package edu.miu.lab3.repository;

import edu.miu.lab3.entity.Category;
import edu.miu.lab3.entity.Product;
import edu.miu.lab3.entity.Review;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends CrudRepository<Product, Long> {

    List<Product> findAllByPriceGreaterThan(double minPrice);

    //List<Product> findAllByCategoryAndPriceLessThan(Category cat, double maxPrice);

    List<Product> findAllByNameContaining(String name);

}
