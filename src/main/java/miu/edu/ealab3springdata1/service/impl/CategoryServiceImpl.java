package miu.edu.ealab3springdata1.service.impl;

import miu.edu.ealab3springdata1.entity.bidirectional.Category;
import miu.edu.ealab3springdata1.repository.CategoryRepo;
import miu.edu.ealab3springdata1.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepo repo;
    @Override
    public List<Category> findAll() {
        return (List<Category>) repo.findAll();
    }

    @Override
    public Optional<Category> findOne(Long id) {
        return repo.findById(id);
    }

    @Override
    public Category save(Category review) {
        return repo.save(review);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }

}
