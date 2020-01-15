package com.ecommerce.service;

import com.ecommerce.entity.Products;

public interface ECommerceService {
	public Products filterByBrand(String brand) throws Exception;
	public Products filterByPrice(String price) throws Exception;
	public Products filterByColor(String color) throws Exception;
	public Products filterBySize(String size) throws Exception;
	public Products getProductBySellerID(String manufacturerID) throws Exception;
}
