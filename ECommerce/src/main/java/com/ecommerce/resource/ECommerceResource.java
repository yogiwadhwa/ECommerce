package com.ecommerce.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.entity.Products;
import com.ecommerce.service.ECommerceService;

@RestController
@RequestMapping("/product")
public class ECommerceResource {

	@Autowired
	ECommerceService eCommerceService;
	
	 @GetMapping("/{brand}")
	    public ResponseEntity<Products> getProductsByBrand(@PathVariable("brand") String brand) 
	                                                    throws Exception {
	        Products products = eCommerceService.filterByBrand(brand);
	 
	        return new ResponseEntity<Products>(products, new HttpHeaders(), HttpStatus.OK);
	    }
	
	 @GetMapping("/{price}")
	    public ResponseEntity<Products> getProductsByPrice(@PathVariable("price") String price) 
	                                                    throws Exception {
	        Products products = eCommerceService.filterByBrand(price);
	 
	        return new ResponseEntity<Products>(products, new HttpHeaders(), HttpStatus.OK);
	    }
	
}
