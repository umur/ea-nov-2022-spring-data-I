package miu.edu.lab3.controller;

import miu.edu.lab3.entity.Review;
import miu.edu.lab3.service.ReviewService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

  private final ReviewService reviewService;

  public ReviewController(ReviewService reviewService) {
    this.reviewService = reviewService;
  }

  @GetMapping
    public List<Review> getReviews() {
       return reviewService.getAllReviews();
    }

    @GetMapping("/{id}")
    public Review getReviewById(@PathVariable int id) {

      return reviewService.getReviewById(id);
    }

    @GetMapping("/product/{id}")
    public List<Review> getReviewByProductId(@PathVariable int id) {

      return reviewService.getReviewByProductId(id);
    }

    @PostMapping("/add")
    public void addReview(@RequestBody Review review) {
        reviewService.addReview(review);
    }




}
