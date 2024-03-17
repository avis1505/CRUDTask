package com.spring.ProductrRepo;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.ProductEntity.ProductEntity;

@Repository
public interface ProductRepo extends JpaRepository<ProductEntity, Integer> {

}
