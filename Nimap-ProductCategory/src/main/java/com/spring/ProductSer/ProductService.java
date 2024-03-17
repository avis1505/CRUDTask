package com.spring.ProductSer;


import java.util.List;
import java.util.Optional;

import com.spring.ProductEntity.ProductEntity;

public interface ProductService {
    
    ProductEntity saveProduct(ProductEntity product);
    
   
    List<ProductEntity> getAllProduct();
    
   
    ProductEntity updateProduct(ProductEntity product, Integer productId);
    
    
    void deleteProductById(Integer productId);
    
   
    Optional<ProductEntity> findById(Integer productId);
}

