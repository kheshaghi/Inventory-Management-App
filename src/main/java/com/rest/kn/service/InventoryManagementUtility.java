package com.rest.kn.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.kn.dao.CategoryRepository;
import com.rest.kn.dao.CustomerRepository;
import com.rest.kn.dao.ProductRepository;
import com.rest.kn.dao.SupplierRepository;
import com.rest.kn.dao.UserRepository;
import com.rest.kn.model.Category;
import com.rest.kn.model.User;

@Service
public class InventoryManagementUtility {
	
	@Autowired
	UserRepository userRepo;
	
	@Autowired
	CategoryRepository categoryRepo;
	
	@Autowired
	ProductRepository productRepo;
	
	@Autowired
	CustomerRepository customerRepo;
	
	@Autowired
	SupplierRepository supplierRepo;
	
	public User getUserDetail(String userName,String password) {
		User user = userRepo.findByUserNameAndPassword(userName,password);
		return user;
	}
	
	public List<Category> preloadCategoryTable(){
		List<Category> categoryLst = categoryRepo.findAll();
		return categoryLst;
	}
	
	public void save(Category category) {
		categoryRepo.save(category);
	}
	
	public Optional<Category> getCategoryDetails(Integer Id) {
		return categoryRepo.findById(Id);
	}

}
