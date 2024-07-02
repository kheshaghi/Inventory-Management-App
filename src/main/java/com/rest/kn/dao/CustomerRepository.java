package com.rest.kn.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.kn.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
