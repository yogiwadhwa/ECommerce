package com.ecommerce.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "ProductSpecs")
public class ProductSpecs {
	
	  @Id
	  @Column(name="RowID")
	  int rowID;
	  
	  @Column(name="ProductID")
	  int productID;
	  
	  @Column(name="SubCategoryID")
	  int subCategoryID;
	  
	  @Column(name="ProductSpec1")
	  String productSpec1;
	  
	  @Column(name="ProductSpec2")
	  String ProductSpec2;
	  
	  @Column(name="ProductSpec3")
	  String ProductSpec3;
}
