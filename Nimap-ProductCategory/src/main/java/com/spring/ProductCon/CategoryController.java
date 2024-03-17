package com.spring.ProductCon;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

//import com.spring.ProductCon.*;
import com.spring.ProductEntity.CategoryEntity;
import com.spring.ProductSer.CategoryService;



@RestController
@RequestMapping("/api/categories") 
public class CategoryController {
    
    @Autowired
    private CategoryService categoryService;
    
    @PostMapping 
    public CategoryEntity saveCategory(@Validated @RequestBody CategoryEntity category) {
        return categoryService.saveCategory(category);
    }
    
    @GetMapping 
    public List<CategoryEntity> getAllCategories() {
        return categoryService.getAllCategory();
    }
    
    @GetMapping("/{categoryId}") 
    public Optional<CategoryEntity> findById(@PathVariable("categoryId") Integer categoryId) {
        return categoryService.findById(categoryId);
    }
    
    @PutMapping("/{categoryId}") 
    public CategoryEntity updateCategory(@RequestBody CategoryEntity category, @PathVariable("categoryId") Integer categoryId) {
        return categoryService.updateCategory(category, categoryId);
    }
    
    @DeleteMapping("/{categoryId}") 
    public String deleteCategoryById(@PathVariable("categoryId") Integer categoryId) {
        categoryService.deleteCategoryById(categoryId);
        return "Deleted Successfully";
    }
}
