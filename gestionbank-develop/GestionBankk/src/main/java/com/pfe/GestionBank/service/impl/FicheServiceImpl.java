package com.pfe.GestionBank.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfe.GestionBank.entity.Fiche;
import com.pfe.GestionBank.repository.FicheRepository;
import com.pfe.GestionBank.service.FicheService;

@Service
public class FicheServiceImpl implements FicheService {
	@Autowired
	FicheRepository ficheRepository;
	
	@Override
	public Fiche save(Fiche fiche) {
		ficheRepository.save(fiche);
		return fiche;
	}

	@Override
	public List<Fiche> findAll() {
		List<Fiche> allfiches = ficheRepository.findAll();
		return allfiches;
	}
	@Override
	public List<Fiche>findFicheByUser_id(int user_id){
		List<Fiche> allficheuser = ficheRepository.findFicheByUser_id(user_id);
		return allficheuser ; 
	}

	@Override
	public Optional<Fiche> findById(int id) {
		return ficheRepository.findById(id);
	}

	@Override
	public Fiche update(Fiche fiche, int id) {
		Optional<Fiche> ancienneFiche = ficheRepository.findById(id);
		if (ancienneFiche.isPresent()) {
			fiche.setId(id);
			ficheRepository.save(fiche);
		}
		return fiche;		
	}

	@Override
	public void deleteFicheById(int id) {
		Optional<Fiche> fiche = ficheRepository.findById(id);
		if (fiche.isPresent()) {
			ficheRepository.deleteById(id);
		}
		
	}

	@Override
	public void deleteAll() {
		ficheRepository.deleteAll();		
	}

}
