package com.pfe.GestionBank.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pfe.GestionBank.entity.Corps;
import com.pfe.GestionBank.repository.CorpsRepository;
import com.pfe.GestionBank.service.CorpsService;

@Service
public class CorpsServiceImpl implements CorpsService {

	@Autowired
	CorpsRepository corpsRepository;

	@Override
	public Corps save(Corps corps) {
		corpsRepository.save(corps);
		return corps;
	}

	@Override
	public List<Corps> findAll() {
		List<Corps> allCorps = corpsRepository.findAll();
		return allCorps;
	}

	@Override
	public Optional<Corps> findById(int id) {
		Optional<Corps> corps = corpsRepository.findById(id);
		return corps;
	}

	@Override
	public void deleteCorpsById(int id) {
		Optional<Corps> corps = corpsRepository.findById(id);
		if (corps.isPresent()) {
			corpsRepository.deleteById(id);
		}
	}

	@Override
	public void deleteAll() {
		corpsRepository.deleteAll();
	}
}
