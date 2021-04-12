package com.pfe.GestionBank.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfe.GestionBank.entity.SubventionSpeciale;
import com.pfe.GestionBank.repository.SubventionSpecialeRepository;
import com.pfe.GestionBank.service.SubventionSpecialeService;

@Service
public class SubventionSpecialeServiceImpl implements SubventionSpecialeService {
	
	@Autowired
	SubventionSpecialeRepository subventionSpecialeRepository;
	
	@Override
	public SubventionSpeciale save(SubventionSpeciale subventionSpeciale) {
		
		return subventionSpecialeRepository.save(subventionSpeciale);
	}

	@Override
	public SubventionSpeciale findById(int id) {
		Optional<SubventionSpeciale> subventionSpeciale;
		subventionSpeciale= subventionSpecialeRepository.findById(id);
		if (subventionSpeciale.isPresent()) {
			return subventionSpeciale.get();
		}
		throw new NullPointerException("subventionSpeciale not found");
	}

	@Override
	public List<SubventionSpeciale> findAll() {
		return subventionSpecialeRepository.findAll();
	}

	@Override
	public void deleteById(int id) {
		subventionSpecialeRepository.deleteById(id);
		
	}

	@Override
	public void deleteAll() {
		subventionSpecialeRepository.deleteAll();
	}
}
