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

import com.pfe.GestionBank.entity.SubventionSpeciale;
import com.pfe.GestionBank.service.SubventionSpecialeService;

@RestController
@RequestMapping(value = "/subventionSpeciales")
public class SubventionSpecialeController {
	@Autowired
	SubventionSpecialeService subventionSpecialeService;
	
	@PostMapping("")
	public SubventionSpeciale createsubventionSpeciale (@RequestBody SubventionSpeciale subventionSpeciale) {
		return subventionSpecialeService.save(subventionSpeciale);
	}
	@GetMapping("/{id}")
	@ResponseBody
	public SubventionSpeciale getsubventionSpeciale (@PathVariable int id) {
		return subventionSpecialeService.findById(id);
	}
	
	@GetMapping("")
	@ResponseBody
	public List<SubventionSpeciale> getAllsubventionSpeciale (){
		return subventionSpecialeService.findAll();
	}
	
	@DeleteMapping("/{id}")
	public String deleteAffecation(@PathVariable int id) {
		subventionSpecialeService.deleteById(id);
		return "{\"subventionSpeciale\": \"deleted\"}";
	}
	@DeleteMapping("")
	public String deleteAllAffecation() {
		subventionSpecialeService.deleteAll();
		return "{\"subventionSpeciales\": \"deleted\"}";
	}
}
