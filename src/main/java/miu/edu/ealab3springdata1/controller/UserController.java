package miu.edu.ealab3springdata1.controller;

import miu.edu.ealab3springdata1.entity.bidirectional.User;
import miu.edu.ealab3springdata1.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserServiceImpl service;


    @GetMapping
    public ResponseEntity<List<User>> getAll(){
        return ResponseEntity.status(HttpStatus.OK).body(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getOne(@PathVariable Long id){
        return service.findOne(id).map(ResponseEntity::ok).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User product){
        return ResponseEntity.status(HttpStatus.OK).body(service.save(product));
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id,@RequestBody User product){
        product.setId(id);
        return ResponseEntity.status(HttpStatus.OK).body(service.save(product));
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id){
        service.delete(id);
    }

}
