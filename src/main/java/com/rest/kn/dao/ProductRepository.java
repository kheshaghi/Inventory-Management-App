package com.rest.kn.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.kn.model.Product;
import com.rest.kn.model.Supplier;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
