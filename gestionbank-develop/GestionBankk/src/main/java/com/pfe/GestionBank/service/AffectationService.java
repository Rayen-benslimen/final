package com.pfe.GestionBank.service;

import java.util.List;

import com.pfe.GestionBank.entity.Affectation;

public interface AffectationService {
	
	Affectation save (Affectation affectation);

	Affectation findById (int id);
	
	List<Affectation> findAll ();
	
	void deleteById (int id);
	
	void deleteAll ();
	

}
