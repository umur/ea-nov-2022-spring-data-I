package edu.miu.eanov2022springdataI.service;

import edu.miu.eanov2022springdataI.model.Product;
import edu.miu.eanov2022springdataI.model.Review;

import java.util.List;

public interface ReviewService {
    public List<Review> getAll();
    public Review getById(long id);
    public Review add(Review review);
    public Review updateById(long id, Review review);
    public void deleteById(long id);
}
