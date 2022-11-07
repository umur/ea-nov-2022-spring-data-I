package com.example.spring_data.helper;


import com.example.spring_data.dto.ProductDto;
import com.example.spring_data.entity.Product;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@RequiredArgsConstructor
public class ProductMapper {
    private final ModelMapper modelMapper;

    public ProductDto toDto(Product product) {
        return modelMapper.map(product, ProductDto.class);
    }

    public List <ProductDto> toDtos(List<Product> products) {
        return products.stream()
                .map(this::toDto)
                .toList();
    }

    public Product toEntity(ProductDto productDto) {
        return modelMapper.map(productDto, Product.class);
    }

    public List<Product> toEntities(List<ProductDto> productDtos) {
        return productDtos.stream()
                .map(this::toEntity)
                .toList();
    }
}