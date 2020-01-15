package com.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.entity.Products;

@Repository
public interface EcommerceRepository extends JpaRepository<Products, String>{

}
