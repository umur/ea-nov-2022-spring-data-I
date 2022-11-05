package com.example.springdataI.service.impl;

import com.example.springdataI.dto.ReviewDto;
import com.example.springdataI.entity.Review;
import com.example.springdataI.mapper.ReviewMapper;
import com.example.springdataI.repository.ReviewRepo;
import com.example.springdataI.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService {
    @Autowired
    ReviewRepo reviewRepo;
    private final ReviewMapper reviewMapper;

    @Transactional
    @Override
    public List <ReviewDto> findAll () {
        return reviewMapper.toDtos ((List <Review>) reviewRepo.findAll ());
    }
    @Transactional
    @Override
    public  ReviewDto findReviewById (Integer id) {
        return reviewMapper.toDto (reviewRepo.findReviewById(id));
    }
    @Transactional
    @Override
    public void create (ReviewDto reviewDto) {
        reviewRepo.save (reviewMapper.toEntity (reviewDto));

    }

    @Override
    public void delete (Integer id) {
        boolean exists = reviewRepo.existsById (id);
        if(!exists){
            throw new IllegalStateException ("Address id:"+id+"does not exist");
        }
        reviewRepo.deleteById (id);

    }

    @Override
    @Transactional
    public void update(Integer id,String comment) {
        Review address = reviewRepo.findById (id)
                .orElseThrow (()->new IllegalStateException (
                        "Address id:"+id+"does not exist"));

        if(comment !=null &&comment.length ()>0 ){
            address.setComment (comment);
        }

    }
    @Transactional
    @Override
    public List <ReviewDto> findByProduct_Id (Integer id) {
        return reviewMapper.toDtos (reviewRepo.findByProduct_Id (id));
    }
}
