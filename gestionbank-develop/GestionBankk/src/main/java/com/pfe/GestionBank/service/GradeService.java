package com.pfe.GestionBank.service;

import java.util.List;

import com.pfe.GestionBank.entity.Grade;

public interface GradeService {
	Grade  save(Grade grade);
	List<Grade> findAll();
	void deleteGradeById(int id);	
	void deleteAll();
	List<Grade> findGradeByCorps_id(int id_corps);
	
}
