package com.pfe.GestionBank.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pfe.GestionBank.entity.CalculPaie;

import com.pfe.GestionBank.service.impl.CalculService;



@RestController
@RequestMapping(value="/calcul")
@CrossOrigin
public class CalculeController {
	
	@Autowired
	private CalculService calculservice ; 
	
	@GetMapping("/{id}")
    public List<CalculPaie> getCalcule(@PathVariable int id) {
		
        return calculservice.claculer(id);
        
    }

	@GetMapping("/rayen")
    public List<CalculPaie> getCalculee() {
	
        return calculservice.claculeRayen();
        
    }

}
