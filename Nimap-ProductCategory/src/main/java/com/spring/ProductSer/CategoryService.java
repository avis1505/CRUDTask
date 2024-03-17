package com.spring.ProductSer;


import java.util.List;
import java.util.Optional;


import com.spring.ProductEntity.CategoryEntity;

public interface CategoryService {
    
    
    CategoryEntity saveCategory(CategoryEntity category);
    
    
    List<CategoryEntity> getAllCategory();
    
    
    CategoryEntity updateCategory(CategoryEntity category, Integer categoryId);
    

    void deleteCategoryById(Integer categoryId);
    
   
    Optional<CategoryEntity> findById(Integer categoryId);
}

