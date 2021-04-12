package com.pfe.GestionBank.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pfe.GestionBank.entity.Grade;
import com.pfe.GestionBank.service.GradeService;

@RestController
@RequestMapping(value="/grades")
@CrossOrigin
public class GradeController {
	@Autowired 
	GradeService gradeService;
	
	@PostMapping("")
	public Grade addGrade(@RequestBody Grade grade) {
		return gradeService.save(grade);
	}
	
	@GetMapping("/corps/{id}")
    public List<Grade> getGradess(@PathVariable int id){
    	return gradeService.findGradeByCorps_id(id);
    }
    
 
    @GetMapping("")
    public List<Grade> getGrades(){
    	return gradeService.findAll();
    }

    @DeleteMapping("/{id_corps}")
    public void deleteById(@PathVariable int id_corps) {
    	gradeService.deleteGradeById(id_corps);
    }
    
    @DeleteMapping("")
    public void deleteAll() {
    	gradeService.deleteAll();
    }
}
