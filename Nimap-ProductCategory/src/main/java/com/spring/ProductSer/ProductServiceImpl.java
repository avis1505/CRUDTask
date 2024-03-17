package com.spring.ProductSer;



import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.spring.ProductCon.*;
import com.spring.ProductEntity.ProductEntity;
import com.spring.ProductrRepo.ProductRepo;


@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo productRepo;

    @Override
    public ProductEntity saveProduct(ProductEntity product) {
        return productRepo.save(product);
    }

    @Override
    public List<ProductEntity> getAllProduct() {
        return productRepo.findAll();
    }

    @Override
    public void deleteProductById(Integer productId) {
        productRepo.deleteById(productId);
    }

    @Override
    public ProductEntity updateProduct(ProductEntity product, Integer productId) {
        Optional<ProductEntity> optionalProduct = productRepo.findById(productId);
        if (optionalProduct.isPresent()) {
            ProductEntity prod = optionalProduct.get();

            if (Objects.nonNull(product.getProductName()) && !"".equalsIgnoreCase(product.getProductName())) {
                prod.setProductName(product.getProductName());
            }

            if (Objects.nonNull(product.getProductPrice()) && !"".equalsIgnoreCase(product.getProductPrice())) {
                prod.setProductPrice(product.getProductPrice());
            }

            return productRepo.save(prod);
        }
        return null; 
    }

    @Override
    public Optional<ProductEntity> findById(Integer productId) {
        return productRepo.findById(productId);
    }
}

