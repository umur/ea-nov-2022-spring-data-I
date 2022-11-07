package com.example.spring_data.controller;


import com.example.spring_data.dto.ReviewDto;
import com.example.spring_data.service.IReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/reviews")
public class ReviewController {
    private final IReviewService reviewService;

    @GetMapping
    public List<ReviewDto> getReviews(){
        return reviewService.findAll ();
    }

    @GetMapping(path = "/{id}")
    public ReviewDto getReviewById(@PathVariable("id") Integer id){
        return reviewService.findReviewById (id);
    }

    @GetMapping(path = "/product/{id}/search")
    public List<ReviewDto> find(@PathVariable("id") Integer id){
        return reviewService.findByProduct_Id (id);
    }

    @PostMapping
    public void create(@RequestBody ReviewDto reviewDto){
        reviewService.create (reviewDto);
    }

    @PutMapping(path = "/{id}")
    public void update(@PathVariable("id") Integer id,
                       @RequestParam(required = false) String comment){
        reviewService.update (id,comment);
    }

    @DeleteMapping(path = "/{id}")
    public void delete(@PathVariable("id") Integer id){
        reviewService.delete(id);

    }
}