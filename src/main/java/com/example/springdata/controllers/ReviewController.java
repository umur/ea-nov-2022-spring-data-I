package com.example.springdata.controllers;

import com.example.springdata.entities.DTOs.ReviewDTO;
import com.example.springdata.services.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reviews")
public class ReviewController {
    @Autowired
    ReviewService reviewService;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody ReviewDTO reviewDTO) {
        return new ResponseEntity<>(reviewService.create(reviewDTO), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getAll() {
        return new ResponseEntity<>(reviewService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable(name = "id") Long id) {
        return new ResponseEntity<>(reviewService.find(id), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable(name = "id") Long id, @RequestParam ReviewDTO reviewDTO) {
        return new ResponseEntity<>(reviewService.update(id, reviewDTO), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") Long id) {
        return new ResponseEntity<>(reviewService.delete(id), HttpStatus.OK);
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<?> findReviewsByProductId(@PathVariable(name = "id") Long id) {
        return new ResponseEntity<>(reviewService.findByProductId(id), HttpStatus.OK);
    }
}
