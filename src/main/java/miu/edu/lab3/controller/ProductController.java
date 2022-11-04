package miu.edu.lab3.controller;

import miu.edu.lab3.entity.Product;
import miu.edu.lab3.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")

public class ProductController {

    //@Autowired or use constructor injection
    private final ProductService productService;

    public ProductController(ProductService productService)  {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getProducts() {
        return productService.getProducts();
    }

    @PostMapping("/add")
    public void addProducts(Product product) {
        productService.addProducts(product);
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable int  id) {
        return productService.getProductById(id);
    }

    @GetMapping("/filter")
    public List<Product> filterFields(@RequestParam (required = false) String categoryName, @RequestParam (required = false) Double price, @RequestParam (required = false) String productName) {
        if (categoryName != null && price != null) {
            return productService.getProductsByCategoryNameAndPrice(categoryName, price);
        } else if (categoryName == null && price != null) {
            return productService.getProductsByPriceGreaterThan(price);
        }
        else if (productName != null) {
            return productService.getProductsByNameContaining(productName);
        } else {
            return productService.getProducts();
        }
    }


}
