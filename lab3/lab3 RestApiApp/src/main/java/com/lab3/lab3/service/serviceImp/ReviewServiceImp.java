package com.lab3.lab3.service.serviceImp;

import com.lab3.lab3.entity.Product;
import com.lab3.lab3.entity.Review;
import com.lab3.lab3.entity.Users;
import com.lab3.lab3.repository.ProductRepo;
import com.lab3.lab3.repository.ReviewRepository;
import com.lab3.lab3.repository.UserRepo;
import com.lab3.lab3.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class ReviewServiceImp implements ReviewService {
    @Autowired
    private ReviewRepository reviewRepository;
    @Autowired
    private ProductRepo productRepo;
    @Autowired
    private UserRepo userRepo;


    @Override
    public String saveReview(Review review ,long productId,long  userId) {
        Users temp =userRepo.findById(userId).get();
        temp.addReview(review);
        Product temp1 =productRepo.findById(productId).get();
        temp1.addReview(review);

        return review.getId() + "for " + temp.getId() + "added successfully";
    }

    @Override
    public String deleteReview(long id) {

        reviewRepository.deleteById(id);
        return "review " + id + " deleted successfully";
    }

    @Override
    public List<Review> getReviewsByUserId(long id) {
         Users user =userRepo.findById(id).get();
        return user.getReviews();
    }

    @Override
    public List<Review> getReviewsByProductId(long id) {
        Product product =productRepo.findById(id).get();
        return product.getReviews();
    }
}
