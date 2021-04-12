package com.pfe.GestionBank.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfe.GestionBank.entity.Affectation;
import com.pfe.GestionBank.repository.AffectationRepository;
import com.pfe.GestionBank.service.AffectationService;

@Service
public class AffectationServiceImpl implements AffectationService {
	
	@Autowired
	AffectationRepository affectationRepository;
	
	@Override
	public Affectation save(Affectation affectation) {
		
		return affectationRepository.save(affectation);
	}

	@Override
	public Affectation findById(int id) {
		Optional<Affectation> affectation;
		affectation =  affectationRepository.findById(id);
		if (affectation.isPresent()) {
			return affectation.get();
		}
		throw new NullPointerException("Affectation not found");
	}

	@Override
	public List<Affectation> findAll() {
		return affectationRepository.findAll();
	}

	@Override
	public void deleteById(int id) {
		affectationRepository.deleteById(id);
	}

	@Override
	public void deleteAll() {
		affectationRepository.deleteAll();
	}

}
