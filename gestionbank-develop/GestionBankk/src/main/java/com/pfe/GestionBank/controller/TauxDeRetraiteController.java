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

import com.pfe.GestionBank.entity.TauxDeRetraite;
import com.pfe.GestionBank.service.TauxDeRetraiteService;

@RestController
@RequestMapping(value = "/tauxDeRetraite")
public class TauxDeRetraiteController {
	@Autowired
	TauxDeRetraiteService tauxDeRetraiteService;
	
	@PostMapping("")
	public TauxDeRetraite createtauxDeRetraite (@RequestBody TauxDeRetraite tauxDeRetraite) {
		return tauxDeRetraiteService.save(tauxDeRetraite);
	}
	@GetMapping("/{id}")
	@ResponseBody
	public TauxDeRetraite gettauxDeRetraite (@PathVariable int id) {
		return tauxDeRetraiteService.findById(id);
	}
	
	@GetMapping("")
	@ResponseBody
	public List<TauxDeRetraite> getAlltauxDeRetraite (){
		return tauxDeRetraiteService.findAll();
	}
	
	@DeleteMapping("/{id}")
	public String deleteAffecation(@PathVariable int id) {
		tauxDeRetraiteService.deleteById(id);
		return "{\"tauxDeRetraite\": \"deleted\"}";
	}
	@DeleteMapping("")
	public String deleteAllAffecation() {
		tauxDeRetraiteService.deleteAll();
		return "{\"tauxDeRetraites\": \"deleted\"}";
	}
}
