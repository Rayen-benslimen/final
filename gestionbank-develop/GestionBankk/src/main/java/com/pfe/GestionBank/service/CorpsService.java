package com.pfe.GestionBank.service;

import java.util.List;
import java.util.Optional;

import com.pfe.GestionBank.entity.Corps;

public interface CorpsService {
	Corps  save(Corps corps);
	List<Corps> findAll();
	Optional<Corps> findById(int id);
	void deleteCorpsById(int id);	
	void deleteAll();

}
