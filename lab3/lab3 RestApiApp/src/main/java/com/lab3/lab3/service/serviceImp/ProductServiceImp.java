package com.lab3.lab3.service.serviceImp;

import com.lab3.lab3.entity.Category;
import com.lab3.lab3.entity.Product;
import com.lab3.lab3.repository.CategoryRepo;
import com.lab3.lab3.repository.ProductRepo;
import com.lab3.lab3.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
@Service
@Transactional
public class ProductServiceImp implements ProductService {
@Autowired
private ProductRepo productRepo;
@Autowired
private CategoryRepo categoryRepo;

    @Override

    public String addProduct(Product product,long categoryid) {
       Category category= categoryRepo.findById(categoryid).get();
       category.addProduct(product);
       return "product saved successfully";
    }

    @Override
    public String DeleteProduct(long id) {
        productRepo.deleteById(id);
        return "product deleted successfully";
    }

    @Override
    public List<Product> products() {
        List<Product> temp=new ArrayList<>();
        productRepo.findAll().forEach(temp::add);
        return temp;
    }

    @Override
    public Product findProductById(long id) {
        return productRepo.findById(id).get();
    }

    @Override
    public List<Product> findAllByNameContaining(String keyword) {
        return productRepo.findAllByNameContaining(keyword);
    }

    @Override
    public List<Product> productByCategoryAndPriceLessThan
            (long categoryid, double maxPrice) {
      Category category =categoryRepo.findById(categoryid).get();
      List<Product> products=category.getProducts().stream()
              .filter(p->p.getPrice()<maxPrice).toList();
      return products;

    }

    @Override
    public List<Product> findAllByPriceGreaterThan(double miPrice) {
     return productRepo.findAllByPriceGreaterThan(miPrice);
    }

}
