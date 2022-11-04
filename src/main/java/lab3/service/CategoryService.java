package lab3.service;

import lab3.models.unidirectional.UniCategory;
import lab3.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }

    public List<UniCategory> getCategories(){
        return this.categoryRepository.findAll();
    }

    public UniCategory getCategoryById(String id){
        return this.categoryRepository.findById(id).orElse(null);
    }

    public UniCategory saveCategory(UniCategory c){
        return this.categoryRepository.save(c);
    }

    public void deleteCategoryById(String id){
        this.categoryRepository.deleteById(id);
    }
}
