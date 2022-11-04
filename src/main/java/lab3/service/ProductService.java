package lab3.service;

import lab3.models.unidirectional.UniProduct;
import lab3.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    ProductRepository productRepository;

    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public List<UniProduct> getProducts(){
        return this.productRepository.findAll();
    }

    public UniProduct getProductById(String id){
        return this.productRepository.findById(id).orElse(null);
    }

    public UniProduct saveProduct(UniProduct p){
        return this.productRepository.save(p);
    }

    public void deleteProductById(String id){
        this.productRepository.deleteById(id);
    }

    public List<UniProduct> filterProductsByMinPrice(double minPrice){
        return this.productRepository.findAllByPriceGreaterThan(minPrice);
    }

    public List<UniProduct> filterProductsByCatAndPrice(String cat, double maxPrice){
        return this.productRepository.findAllByCategoryAndAndPriceLessThan(cat, maxPrice);
    }

    public List<UniProduct> filterProductsNameContainKeyword(String keyword){
        return this.productRepository.findAllByNameContaining(keyword);
    }
}
