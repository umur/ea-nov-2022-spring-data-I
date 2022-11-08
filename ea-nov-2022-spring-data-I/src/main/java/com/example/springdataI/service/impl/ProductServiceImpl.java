package com.example.springdataI.service.impl;

import com.example.springdataI.dto.ProductDto;
import com.example.springdataI.entity.Product;
import com.example.springdataI.entity.Users;
import com.example.springdataI.mapper.ProductMapper;
import com.example.springdataI.repository.ProductRepo;
import com.example.springdataI.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepo productRepo;

    private final ProductMapper productMapper;
    @Transactional
    @Override
    public List <ProductDto> findAll () {
        return productMapper.toDtos ((List <Product>) productRepo.findAll ());
    }
    @Transactional
    @Override
    public  ProductDto findProductById (Integer id) {
        return productMapper.toDto (productRepo.findProductById (id));
    }


    @Override
    @Transactional
    public void create (ProductDto productDto) {
        Product product = productMapper.toEntity (productDto);
        productRepo.save (product);
    }

    @Override
    public void delete (Integer id) {
        boolean exists = productRepo.existsById (id);
        if(!exists){
            throw new IllegalStateException ("Product id:"+id+"does not exist");
        }
        productRepo.deleteById (id);

    }

    @Override
    @Transactional
    public void update(Integer id,String name,double price) {
        Product product = productRepo.findById (id)
                .orElseThrow (()->new IllegalStateException (
                        "Product id:"+id+"does not exist"));

        if(name !=null &&name.length ()>0 ){
            product.setName (name);
        }
        if(price >0){
            product.setPrice (price);
        }
    }
    @Transactional
    @Override
    public List <ProductDto> findProductsByPrice(double minPrice) {
        return productMapper.toDtos (productRepo.findProductsByPriceGreaterThanEqual (minPrice));
    }
    @Transactional
    @Override
    public List <ProductDto> findByCategory_IdAndPrice (Integer id,double maxPrice) {
        return productMapper.toDtos (productRepo.findByCategory_IdAndPriceLessThanEqual (id,maxPrice));
    }

    @Transactional
    @Override
    public List <ProductDto> findProductsByNameContains (String keyword) {
        return productMapper.toDtos (productRepo.findProductsByNameContains (keyword));
    }
}
