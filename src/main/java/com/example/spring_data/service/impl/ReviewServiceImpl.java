package com.example.spring_data.service.impl;

import com.example.spring_data.dto.ReviewDto;
import com.example.spring_data.entity.Review;
import com.example.spring_data.helper.ReviewMapper;
import com.example.spring_data.repository.IReviewRepo;
import com.example.spring_data.service.IReviewService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@AllArgsConstructor
public class ReviewServiceImpl implements IReviewService {


    IReviewRepo reviewRepo;
    private final ReviewMapper reviewMapper;
    @Transactional
    @Override
    public List<ReviewDto> findAll () {
        return reviewMapper.toDtos ((List <Review>) reviewRepo.findAll ());
    }
    @Transactional
    @Override
    public  ReviewDto findReviewById (Integer id) {
        return reviewMapper.toDto (reviewRepo.findById(id).orElse(new Review()));
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
        return reviewMapper.toDtos (reviewRepo.getReviewByProduct (id));
    }
}
