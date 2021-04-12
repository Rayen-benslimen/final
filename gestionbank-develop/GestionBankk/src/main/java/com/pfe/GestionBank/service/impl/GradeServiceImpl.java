package com.pfe.GestionBank.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfe.GestionBank.entity.Grade;
import com.pfe.GestionBank.repository.GradeRepository;
import com.pfe.GestionBank.service.GradeService;
@Service
public class GradeServiceImpl implements GradeService {
	@Autowired
	GradeRepository gradeRepository;
	
	@Override
	public Grade save(Grade grade) {
		gradeRepository.save(grade);
		return grade;
	}

	@Override
	public List<Grade> findAll() {
		List<Grade> allgrades = gradeRepository.findAll();
		return allgrades;
	}

	@Override
	public List<Grade> findGradeByCorps_id(int id_corps) {
		List<Grade> x = gradeRepository.findGradeByCorps_id(id_corps);
		return x;
	
	}	
	

	@Override
	public void deleteGradeById(int id) {
		Optional<Grade> grade = gradeRepository.findById(id);
		if (grade.isPresent()) {
			gradeRepository.deleteById(id);
		}
		
	}

	@Override
	public void deleteAll() {
		gradeRepository.deleteAll();
		
	}

}
