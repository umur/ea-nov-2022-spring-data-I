package edu.miu.springdatademo.repository;

import edu.miu.springdatademo.model.uniDirectional.Category;
import edu.miu.springdatademo.model.uniDirectional.Product;
import edu.miu.springdatademo.service.ProductService;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

     public List<Product> findProductByPriceGreaterThan(int price);
//     public List<Product> findProductByCategoryAndPriceLessThan(String category, int price);
     public List<Product> findProductByCategory_NameAndPriceLessThan(String category, int price);
     public List<Product> findProductByNameContainingIgnoreCase(String keyword);


}
