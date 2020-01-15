package com.ecommerce.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Manufacturer")
public class Manufacturer {
	@Id
	@Column(name="ManufacturerID")
	int manufacturerID ;
	
	@Column(name="ManufacturerName")
    String manufacturerName;
	
	@Column(name="SubCategoryID")
    int subCategoryID;
}
