package com.pfe.GestionBank.service;

import java.util.List;

import com.pfe.GestionBank.entity.Subvention;

public interface SubventionService {

	Subvention save (Subvention subvention);
	
	Subvention findById (int id);
	
	List<Subvention> findAll ();
	
	void deleteById (int id);
	
	void deleteAll();
	
}
