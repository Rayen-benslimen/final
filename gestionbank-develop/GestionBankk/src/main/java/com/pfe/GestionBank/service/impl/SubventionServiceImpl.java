package com.pfe.GestionBank.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfe.GestionBank.entity.Subvention;
import com.pfe.GestionBank.repository.SubventionRepository;
import com.pfe.GestionBank.service.SubventionService;

@Service
public class SubventionServiceImpl implements SubventionService {
	
	@Autowired
	SubventionRepository subventionRepository;
	
	@Override
	public Subvention save(Subvention subvention) {
		
		return subventionRepository.save(subvention);
	}

	@Override
	public Subvention findById(int id) {
		Optional<Subvention> subvention;
		subvention= subventionRepository.findById(id);
		if (subvention.isPresent()) {
			return subvention.get();
		}
		throw new NullPointerException("Subvention not found");
	}

	@Override
	public List<Subvention> findAll() {
		return subventionRepository.findAll();
	}

	@Override
	public void deleteById(int id) {
		subventionRepository.deleteById(id);
		
	}

	@Override
	public void deleteAll() {
		subventionRepository.deleteAll();
	}

}
