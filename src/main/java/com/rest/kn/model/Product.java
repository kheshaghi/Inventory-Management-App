package com.rest.kn.model;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "product")
public class Product {
	
	@Id
	public Integer productId;
	
	public String productName;
	
	public String description;
	
	public Integer quantity;
	
	public Double sellingPrice;
	
	public Double costPrice;
	
	public Double profit;
	
	public Integer gstRate;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "categoryId",referencedColumnName = "id")
	public Category category;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "supplierId",referencedColumnName = "id")
	public Supplier supplier;
	
	public Date createdOn;
	
	public String createdBy;
	
	public Date modifiedOn;
	
	public String modifiedBy;
	
}
