package com.ecommerce.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Products")
public class Products {
	
	@Id
	@Column(name="productID")
	int ProductID;
	
	@Column(name="productName")
	String ProductName;
	
	@Column(name="categoryID")
	int CategoryID;
	
	@Column(name="subCategoryID")
	int SubCategoryID;
	
	@Column(name="manufacturerID")
	int ManufacturerID;
	
	@Column(name="size")
	int size;
	
	@Column(name="color")
	String color;
}
