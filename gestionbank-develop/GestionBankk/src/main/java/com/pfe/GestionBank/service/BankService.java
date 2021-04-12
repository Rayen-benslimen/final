package com.pfe.GestionBank.service;

import java.util.List;
import java.util.Optional;

import com.pfe.GestionBank.entity.Bank;

public interface BankService {
	Bank  save(Bank bank);
	List<Bank> findAll();
	Optional<Bank> findById(int id);
	void deleteBankById(int id);	
	void deleteAll();
}
