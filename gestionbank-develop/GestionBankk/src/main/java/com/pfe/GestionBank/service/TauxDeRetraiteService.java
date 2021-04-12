package com.pfe.GestionBank.service;

import java.util.List;

import com.pfe.GestionBank.entity.TauxDeRetraite;

public interface TauxDeRetraiteService {
	
	TauxDeRetraite save(TauxDeRetraite tauxDeRetraite);

	TauxDeRetraite findById(int id);

	List<TauxDeRetraite> findAll();

	void deleteById(int id);

	void deleteAll();
}
