package com.lab3.lab3.controller;

import com.lab3.lab3.entity.Product;
import com.lab3.lab3.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/{categoryid}")
    public String saveProduct(@RequestBody Product product,@PathVariable long categoryid){
        return productService.addProduct(product,categoryid);
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable long id){
        return productService.findProductById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable long id){
        return productService.DeleteProduct(id);
    }

    @GetMapping("/{categoryid}/{maxprice}")
    public List<Product> productByCategoryAndPriceLessThan
            (@PathVariable long categoryid , @PathVariable double maxprice){

        return productService.productByCategoryAndPriceLessThan(categoryid,maxprice);

    }

    @GetMapping("/contains/{keyword}")
    List<Product> findAllByNameContaining(@PathVariable  String keyword){
        return productService.findAllByNameContaining(keyword);
    }

@GetMapping("/minprice/{minprice}")
    List<Product> findAllByPriceGreaterThan(@PathVariable  double minPrice) {
        return productService.findAllByPriceGreaterThan(minPrice);
    }

}
