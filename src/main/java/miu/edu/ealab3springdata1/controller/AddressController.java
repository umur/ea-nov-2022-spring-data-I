package miu.edu.ealab3springdata1.controller;

import miu.edu.ealab3springdata1.entity.bidirectional.Address;
import miu.edu.ealab3springdata1.service.impl.AddressServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("addresses")
public class AddressController {

    @Autowired
    private AddressServiceImpl service;


    @GetMapping
    public ResponseEntity<List<Address>> getAll(){
        return ResponseEntity.status(HttpStatus.OK).body(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Address>> getOne(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(service.findOne(id));
    }

    @PostMapping
    public ResponseEntity<Address> createAddress(@RequestBody Address product){
        return ResponseEntity.status(HttpStatus.OK).body(service.save(product));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Address> updateAddress(@PathVariable Long id, @RequestBody Address product){
        product.setId(id);
        return ResponseEntity.status(HttpStatus.OK).body(service.save(product));
    }

    @DeleteMapping
    public void deleteAddress(@PathVariable Long id){
        service.delete(id);
    }

}
