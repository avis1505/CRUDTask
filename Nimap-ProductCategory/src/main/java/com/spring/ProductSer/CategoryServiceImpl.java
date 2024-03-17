package com.spring.ProductSer;



import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.spring.ProductCon.*;
import com.spring.ProductEntity.CategoryEntity;
import com.spring.ProductrRepo.CategoryRepo;


@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepo categoryRepo;

    @Override
    public CategoryEntity saveCategory(CategoryEntity category) {
        return categoryRepo.save(category);
    }

    @Override
    public List<CategoryEntity> getAllCategory() {
        return categoryRepo.findAll();
    }

    @Override
    public CategoryEntity updateCategory(CategoryEntity category, Integer categoryId) {
        CategoryEntity cat = categoryRepo.findById(categoryId).orElse(null);

        if (cat != null) {
            if (Objects.nonNull(category.getCategoryName()) && !"".equalsIgnoreCase(category.getCategoryName())) {
                cat.setCategoryName(category.getCategoryName());
            }
            return categoryRepo.save(cat);
        }
        return null; 
    }

    @Override
    public void deleteCategoryById(Integer categoryId) {
        categoryRepo.deleteById(categoryId);
    }

    @Override
    public Optional<CategoryEntity> findById(Integer categoryId) {
        return categoryRepo.findById(categoryId);
    }
}

