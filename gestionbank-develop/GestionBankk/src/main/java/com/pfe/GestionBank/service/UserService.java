package com.pfe.GestionBank.service;

import java.util.List;

import com.pfe.GestionBank.entity.User;

public interface UserService {

	User save (User user);
	
	User findById (int id);
		
	List<User> findAll ();
	
	void deleteById (int id);
	
	void deleteAll();
}
