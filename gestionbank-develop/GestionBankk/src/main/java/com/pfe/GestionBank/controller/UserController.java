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

import com.pfe.GestionBank.entity.User;
import com.pfe.GestionBank.service.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	@Autowired
	UserService userService;
	
	@PostMapping("/register")
	@ResponseBody
	public User createuser (@RequestBody User user) {
		return userService.save(user);
	}
	@GetMapping("/{id}")
	@ResponseBody
	public User getuser (@PathVariable int id) {
		return userService.findById(id);
	}
	
	@GetMapping("")
	@ResponseBody
	public List<User> getAlluser (){
		return userService.findAll();
	}
	
	@DeleteMapping("/{id}")
	public String deleteAffecation(@PathVariable int id) {
		userService.deleteById(id);
		return "{\"user\": \"deleted\"}";
	}
	@DeleteMapping("")
	public String deleteAllAffecation() {
		userService.deleteAll();
		return "{\"users\": \"deleted\"}";
	}
}
