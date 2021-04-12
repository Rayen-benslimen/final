package com.pfe.GestionBank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pfe.GestionBank.entity.Affectation;
import com.pfe.GestionBank.service.AffectationService;

@RestController
@RequestMapping(value = "/affectations")
public class AffectationController {
	
	@Autowired
	AffectationService affectationService;
	
	@PostMapping("")
	public Affectation createAffectation (@RequestBody Affectation affectation) {
		return affectationService.save(affectation);
	}
	@GetMapping("/{id}")
	@ResponseBody
	public Affectation getAffectation (@PathVariable int id) {
		return affectationService.findById(id);
	}
	
	@GetMapping("")
	@ResponseBody
	public List<Affectation> getAllAffectation (){
		return affectationService.findAll();
	}
	
	@DeleteMapping("/{id}")
	public String deleteAffecation(@PathVariable int id) {
		affectationService.deleteById(id);
		return "{\"affecation\": \"deleted\"}";
	}
	@DeleteMapping("")
	public String deleteAllAffecation() {
		affectationService.deleteAll();
		return "{\"affecations\": \"deleted\"}";
	}

}
