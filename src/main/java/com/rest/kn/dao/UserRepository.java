package com.rest.kn.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.kn.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	public User findByUserNameAndPassword(String userName,String password);
}
