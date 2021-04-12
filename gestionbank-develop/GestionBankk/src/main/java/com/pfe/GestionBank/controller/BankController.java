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
import com.pfe.GestionBank.entity.Bank;
import com.pfe.GestionBank.service.BankService;

@RestController
@RequestMapping(value="/bank")
@CrossOrigin
public class BankController {
	@Autowired 
	BankService bankService;
	
	@PostMapping("")
	public Bank addBank(@RequestBody Bank bank) {
		return bankService.save(bank);
	}
	
    @GetMapping("/{id}")
    public Optional<Bank> getBank(@PathVariable int id) {
        return bankService.findById(id);
    }
    
    @GetMapping("")
    public List<Bank> getBanks(){
    	return bankService.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id) {
    	 bankService.deleteBankById(id);
    }
    
    @DeleteMapping("")
    public void deleteAll() {
    	 bankService.deleteAll();
    }

}
