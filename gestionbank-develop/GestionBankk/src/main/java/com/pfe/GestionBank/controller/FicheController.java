package com.pfe.GestionBank.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pfe.GestionBank.entity.Fiche;
import com.pfe.GestionBank.service.FicheService;

@RestController
@RequestMapping(value="/fiches")
@CrossOrigin
public class FicheController {
	@Autowired 
	FicheService ficheService;
	
	@PostMapping("")
	public Fiche addFiche(@RequestBody Fiche fiche) {
		return ficheService.save(fiche);
	}
	
    @GetMapping("/{id}")
    public Optional<Fiche> getFiche(@PathVariable int id) {
        return ficheService.findById(id);
    }
    @GetMapping("/myfiche/{user_id}")
    public List<Fiche> getbyuserid(@PathVariable int user_id){
    	return ficheService.findFicheByUser_id(user_id);
    }
    
    @GetMapping("")
    public List<Fiche> getFiches(){
    	return ficheService.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id) {
    	ficheService.deleteFicheById(id);
    }
    
    @DeleteMapping("")
    public void deleteAll() {
    	ficheService.deleteAll();
    }
    
    @PutMapping("/{id}")
    public Fiche updateFiche(@RequestBody Fiche fiche ,@PathVariable int id) {
    	return  ficheService.update(fiche, id);
    }


}
