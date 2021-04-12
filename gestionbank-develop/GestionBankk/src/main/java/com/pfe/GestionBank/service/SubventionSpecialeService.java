package com.pfe.GestionBank.service;

import java.util.List;

import com.pfe.GestionBank.entity.SubventionSpeciale;

public interface SubventionSpecialeService {

	SubventionSpeciale save (SubventionSpeciale subventionSpeciale);
	
	SubventionSpeciale findById (int id);
	
	List<SubventionSpeciale> findAll ();
	
	void deleteById (int id);
	
	void deleteAll();
}
