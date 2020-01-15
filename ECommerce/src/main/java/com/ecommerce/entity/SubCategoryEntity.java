package com.ecommerce.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Sub_Category")
public class SubCategoryEntity {

	@Id
	@Column(name="SubCategoryID")
	int subCategoryID;
	
	@Column(name = "SubCategoryName")
	String subCategoryName;
	
	@ManyToOne
	@JoinColumn(name= "CategoryID")
	String categoryID; 
	
	@Column(name="CreatedBy")
	String createdBy;
	
	@Column(name= "CreatedOn")
	String createdOn;
}
