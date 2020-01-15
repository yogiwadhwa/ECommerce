package com.ecommerce.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Category")
public class Category {
	
	@Id
	@Column(name="CategoryID")
    private int categoryID;
    
    @Column(name = "CategoryName")
    private String categoryName; 
    
    @Column(name= "CreatedBy")
    private String createdBy;
    
    @Column(name= "CreatedOn")
    private Date createdOn;
    
}
