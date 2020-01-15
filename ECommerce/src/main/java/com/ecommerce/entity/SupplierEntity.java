package com.ecommerce.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Supplier")
public class SupplierEntity {

	@Id
	@Column(name = "SupplierID")
	private int supplierID;
	
	@Column(name="SupplierName")
	private String supplierName;
	
	@Column(name="SupplierTag")
	private String supplierTag;
	
}
