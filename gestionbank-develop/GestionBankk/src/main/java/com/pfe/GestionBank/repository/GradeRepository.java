package com.pfe.GestionBank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfe.GestionBank.entity.Grade;

@Repository
public interface GradeRepository extends JpaRepository<Grade, Integer>{

	public List<Grade> findGradeByCorps_id(int  corps_id);

	

}
