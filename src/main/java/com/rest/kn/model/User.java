package com.rest.kn.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer userId;
	
	public String userName;
	
	public String password;
	
	public Date createdOn;
	
	public String createdBy;
	
	public Date modifiedOn;
	
	public String modifiedBy;
	
}
