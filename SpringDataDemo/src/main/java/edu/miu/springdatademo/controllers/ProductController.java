package edu.miu.springdatademo.controllers;

import com.fasterxml.jackson.annotation.JsonIgnore;
import edu.miu.springdatademo.model.uniDirectional.Product;
import edu.miu.springdatademo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> findAll(){
        return productService.findAll();
    }

    @GetMapping("/{price}")
    public List<Product> findGreaterThanMinPrice(@PathVariable int price){
        return productService.findProductByPriceGreaterThan(price);
    }

    @GetMapping("/filter")
    public List<Product> findProductByCategory_NameAndPriceLessThan(@RequestParam String category, @RequestParam int price){
        return productService.findProductByCategory_NameAndPriceLessThan(category, price);
    }

}
