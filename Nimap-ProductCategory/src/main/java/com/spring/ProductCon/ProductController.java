package com.spring.ProductCon;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

//import com.spring.ProductCon.*;
import com.spring.ProductEntity.ProductEntity;
import com.spring.ProductSer.ProductService;

@RestController
@RequestMapping("/api/products") 
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping 
    public ProductEntity saveProduct(@Validated @RequestBody ProductEntity product) {
        return productService.saveProduct(product);
    }

    @GetMapping 
    public List<ProductEntity> getAllProducts() {
        return productService.getAllProduct();
    }

    @GetMapping("/{productId}") 
    public Optional<ProductEntity> findById(@PathVariable("productId") Integer productId) {
        return productService.findById(productId);
    }

    @PutMapping("/{productId}") 
    public ProductEntity updateProduct(@RequestBody ProductEntity product, @PathVariable("productId") Integer productId) {
        return productService.updateProduct(product, productId);
    }

    @DeleteMapping("/{productId}") 
    public String deleteProductById(@PathVariable("productId") Integer productId) {
        productService.deleteProductById(productId); // Corrected method name
        return "Deleted Successfully";
    }
}

