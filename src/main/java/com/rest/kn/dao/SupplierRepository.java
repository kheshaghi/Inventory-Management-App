package com.rest.kn.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.kn.model.User;

@Repository
public interface SupplierRepository extends JpaRepository<User, Integer>{

}
