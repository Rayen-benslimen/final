package com.pfe.GestionBank.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pfe.GestionBank.entity.Bank;
import com.pfe.GestionBank.repository.BankRepository;
import com.pfe.GestionBank.service.BankService;

@Service
public class BankServiceImpl implements BankService{
	@Autowired
	BankRepository bankRepository;

	@Override
	public Bank save(Bank bank) {
		bankRepository.save(bank);
		return bank;
	}

	@Override
	public List<Bank> findAll() {
		List<Bank> allBanks = bankRepository.findAll();
		return allBanks;
	}

	@Override
	public Optional<Bank> findById(int id) {
		Optional<Bank> bank = bankRepository.findById(id);
		return bank;
	}

	@Override
	public void deleteBankById(int id) {
		Optional<Bank> bank = bankRepository.findById(id);
		if (bank.isPresent()) {
			bankRepository.deleteById(id);
		}		
	}

	@Override
	public void deleteAll() {
		bankRepository.deleteAll();		
	}

}
