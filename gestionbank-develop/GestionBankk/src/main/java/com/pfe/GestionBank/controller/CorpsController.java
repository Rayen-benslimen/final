package com.pfe.GestionBank.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pfe.GestionBank.entity.Corps;
import com.pfe.GestionBank.service.CorpsService;

@RestController
@RequestMapping(value="/corps")
@CrossOrigin
public class CorpsController {
	@Autowired 
	CorpsService corpsService;
	
	@PostMapping("")
	public Corps addCorps(@RequestBody Corps corps) {
		return corpsService.save(corps);
	}
	
    @GetMapping("/{id}")
    public Optional<Corps> getCorps(@PathVariable int id) {
        return corpsService.findById(id);
    }
    
    @GetMapping("")
    public List<Corps> getAllCorps(){
    	return corpsService.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id) {
    	corpsService.deleteCorpsById(id);
    }
    
    @DeleteMapping("")
    public void deleteAll() {
    	corpsService.deleteAll();
    }
}
