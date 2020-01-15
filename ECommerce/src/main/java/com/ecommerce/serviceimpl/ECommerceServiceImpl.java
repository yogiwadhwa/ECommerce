package com.ecommerce.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.entity.Products;
import com.ecommerce.repository.EcommerceRepository;
import com.ecommerce.service.ECommerceService;

@Service
public class ECommerceServiceImpl implements ECommerceService {

	 @Autowired
	 EcommerceRepository repository;
	 
	public Products filterByBrand(String brand) throws Exception{
		
		Optional<Products> product = repository.findById(brand);
        
		if(product.isPresent()) {
            return product.get();
        } else {
            throw new Exception();
        }
	}
	
	public Products filterByPrice(String price) throws Exception {
		
		Optional<Products> product = repository.findById(price);
        
		if(product.isPresent()) {
            return product.get();
        } else {
            throw new Exception();
        }
	}
	
	public Products filterByColor(String color) throws Exception{
		Optional<Products> product = repository.findById(color);
        
		if(product.isPresent()) {
            return product.get();
        } else {
            throw new Exception();
        }
	}
	
	public Products filterBySize(String size) throws Exception{
		Optional<Products> product = repository.findById(size);
        
		if(product.isPresent()) {
            return product.get();
        } else {
            throw new Exception();
        }
	}
	
	public Products getProductBySellerID(String manufacturerID) throws Exception{
		Optional<Products> product = repository.findById(manufacturerID);
        
		if(product.isPresent()) {
            return product.get();
        } else {
            throw new Exception();
        }
	}
}
