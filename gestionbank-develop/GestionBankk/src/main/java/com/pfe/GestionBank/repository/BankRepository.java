package com.pfe.GestionBank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pfe.GestionBank.entity.Bank;


public interface BankRepository extends JpaRepository<Bank, Integer>{

}
