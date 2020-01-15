package com.ecommerce.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "ProductAvailability")
public class ProductAvailability {

	  @Id
	  @Column(name="RowID")
	  int rowID;
	  
	  @Column(name="ProductID")
	  int productID;
	  
	  @Column(name="supplierID")
	  int supplierID;
	  
	  @Column(name="SupplierWEB")
	  String supplierWEB;
	  
	  @Column(name="ProductPrice")
	  float productPrice;
}
