package com.rest.kn.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.kn.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
