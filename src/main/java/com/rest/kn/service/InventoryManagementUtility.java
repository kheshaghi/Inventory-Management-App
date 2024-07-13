package com.rest.kn.service;

import java.util.List;
import java.util.Optional;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.kn.dao.CategoryRepository;
import com.rest.kn.dao.CustomerRepository;
import com.rest.kn.dao.ProductRepository;
import com.rest.kn.dao.SupplierRepository;
import com.rest.kn.dao.UserRepository;
import com.rest.kn.model.Category;
import com.rest.kn.model.Product;
import com.rest.kn.model.Supplier;
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

	public User getUserDetail(String userName, String password) {
		User user = userRepo.findByUserNameAndPassword(userName, password);
		return user;
	}

	public List<Category> preloadCategoryTable() {
		List<Category> categoryLst = categoryRepo.findAll();
		return categoryLst;
	}

	public void save(Category category) {
		categoryRepo.save(category);
	}

	public Optional<Category> getCategoryDetails(Integer Id) {
		return categoryRepo.findById(Id);
	}

	public List<Supplier> preloadSupplierTable() {
		List<Supplier> supplierLst = supplierRepo.findAll();
		return supplierLst;
	}
	
	public Optional<Supplier> getSupplierDetails(Integer Id) {
		return supplierRepo.findById(Id);
	}

	public List<Product> preloadProductTable() {
		List<Product> productLst = productRepo.findAll();
		return productLst;
	}

	public void saveProduct(Product product) {
		productRepo.save(product);
	}

	public String validateFields(String action, String productId, String productName, String desc, String quantity,
			String sellingPrice, String costPrice) {

		Integer qty = 0;
		Double sp = 0.00;
		Double cp = 0.00;
		if (StringUtils.isNotBlank(quantity)) {
			if (!isInteger(quantity)) {
				return "Quantity must be number";
			}
			qty = Integer.parseInt(quantity);
		}
		if (StringUtils.isNotBlank(sellingPrice)) {
			if (!isDouble(sellingPrice)) {
				return "Selling price must be number";
			}
			sp = Double.parseDouble(sellingPrice);
		}
		if (StringUtils.isNotBlank(costPrice)) {
			if (!isDouble(costPrice)) {
				return "Cost price must be number";
			}
			cp = Double.parseDouble(costPrice);
		}
		if (!(StringUtils.isNotBlank(productId) && StringUtils.isNotBlank(productName) && StringUtils.isNotBlank(desc)
				&& qty > 0 && sp > 0.0 && cp > 0.0)) {
			return "Please fill all the fields!";
		}

		return null;
	}
	
	public Boolean isInteger(String str) {
		try {
			Integer.parseInt(str);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}
	
	public Boolean isDouble(String str) {
		try {
			Double.parseDouble(str);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}

}
