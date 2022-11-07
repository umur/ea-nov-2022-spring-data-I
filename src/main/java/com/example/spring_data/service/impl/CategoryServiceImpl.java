package com.example.spring_data.service.impl;


import com.example.spring_data.dto.CategoryDto;
import com.example.spring_data.entity.Category;
import com.example.spring_data.helper.CategoryMapper;
import com.example.spring_data.repository.ICategoryRepo;
import com.example.spring_data.service.ICategoryService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@AllArgsConstructor
public class CategoryServiceImpl implements ICategoryService {
    @Autowired
    ICategoryRepo categoryRepo;
    private final CategoryMapper categoryMapper;
    @Transactional
    @Override
    public List<CategoryDto> findAll () {
        return categoryMapper.toDtos ((List <Category>) categoryRepo.findAll ());
    }
    @Transactional
    @Override
    public  CategoryDto findCategoryById (Integer id) {
        return categoryMapper.toDto (categoryRepo.findById(id).orElse(new Category()));
    }

    @Transactional
    @Override
    public void create (CategoryDto categoryDto) {
        categoryRepo.save (categoryMapper.toEntity (categoryDto));

    }

    @Override
    public void delete (Integer id) {
        boolean exists = categoryRepo.existsById (id);
        if(!exists){
            throw new IllegalStateException ("Product id:"+id+"does not exist");
        }
        categoryRepo.deleteById (id);

    }

    @Override
    @Transactional
    public void update(Integer id,String name) {
        Category product = categoryRepo.findById (id)
                .orElseThrow (()->new IllegalStateException (
                        "Product id:"+id+"does not exist"));

        if(name !=null &&name.length ()>0 ){
            product.setName (name);
        }
    }
}
