package com.example.spring_data.service.impl;

import com.example.spring_data.dto.ProductDto;
import com.example.spring_data.entity.Product;
import com.example.spring_data.helper.ProductMapper;
import com.example.spring_data.repository.IProdcutRepo;
import com.example.spring_data.service.IProdcutService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements IProdcutService {
    @Autowired
    IProdcutRepo productRepo;

    private final ProductMapper productMapper;
    @Transactional
    @Override
    public List<ProductDto> findAll () {
        return productMapper.toDtos ((List<Product>) productRepo.findAll ());
    }
    @Transactional
    @Override
    public  ProductDto findProductById (Integer id) {
        return productMapper.toDto (productRepo.findById (id).orElse(new Product()));
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
    public List <ProductDto> findByCategoryIdAndPrice (Integer id,double maxPrice) {
        return productMapper.toDtos (productRepo.findByCategory_IdAndPriceLessThanEqual (id,maxPrice));
    }

    @Transactional
    @Override
    public List <ProductDto> findProductsByNameContains (String keyword) {
        return productMapper.toDtos (productRepo.findProductsByNameContains (keyword));
    }
}
