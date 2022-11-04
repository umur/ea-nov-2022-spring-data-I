package miu.edu.ealab3springdata1.controller;

import miu.edu.ealab3springdata1.entity.bidirectional.Category;
import miu.edu.ealab3springdata1.service.impl.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("reviews")
public class ReviewController {

    @Autowired
    private CategoryServiceImpl service;


    @GetMapping
    public ResponseEntity<List<Category>> getAll(){
        return ResponseEntity.status(HttpStatus.OK).body(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Category> getOne(@PathVariable Long id){
        return service.findOne(id).map(ResponseEntity::ok).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
        //return ResponseEntity.status(HttpStatus.OK).body(service.findOne(id));
    }

    @PostMapping
    public ResponseEntity<Category> createCategory(@RequestBody Category product){
        return ResponseEntity.status(HttpStatus.OK).body(service.save(product));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Category> updateCategory(@PathVariable Long id,@RequestBody Category product){
        product.setId(id);
        return ResponseEntity.status(HttpStatus.OK).body(service.save(product));
    }

    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable Long id){
        service.delete(id);
    }

}
