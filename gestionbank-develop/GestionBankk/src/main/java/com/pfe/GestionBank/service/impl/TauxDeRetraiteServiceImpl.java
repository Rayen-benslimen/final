package com.pfe.GestionBank.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfe.GestionBank.entity.TauxDeRetraite;
import com.pfe.GestionBank.repository.TauxDeRetraiteRepository;
import com.pfe.GestionBank.service.TauxDeRetraiteService;

@Service
public class TauxDeRetraiteServiceImpl implements TauxDeRetraiteService {
	
	@Autowired
	TauxDeRetraiteRepository tauxDeRetraiteRepository;
	
	@Override
	public TauxDeRetraite save(TauxDeRetraite TauxDeRetraite) {
		
		return tauxDeRetraiteRepository.save(TauxDeRetraite);
	}

	@Override
	public TauxDeRetraite findById(int id) {
		Optional<TauxDeRetraite> tauxDeRetraite;
		tauxDeRetraite =  tauxDeRetraiteRepository.findById(id);
		if (tauxDeRetraite.isPresent()) {
			return tauxDeRetraite.get();
		}
		throw new NullPointerException("TauxDeRetraite not found");
	}

	@Override
	public List<TauxDeRetraite> findAll() {
		return tauxDeRetraiteRepository.findAll();
	}

	@Override
	public void deleteById(int id) {
		tauxDeRetraiteRepository.deleteById(id);
	}

	@Override
	public void deleteAll() {
		tauxDeRetraiteRepository.deleteAll();
	}

}
