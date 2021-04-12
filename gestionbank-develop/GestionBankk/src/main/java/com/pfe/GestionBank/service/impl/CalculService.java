package com.pfe.GestionBank.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pfe.GestionBank.entity.CalculPaie;
import com.pfe.GestionBank.entity.Fiche;
import com.pfe.GestionBank.entity.SubventionSpeciale;
import com.pfe.GestionBank.entity.TauxDeRetraite;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class CalculService {
	
	
	@Autowired
	FicheServiceImpl ficheservice ; 
	@Autowired
	TauxDeRetraiteServiceImpl tauxservice ; 
	@Autowired
	SubventionSpecialeServiceImpl subservice ;
	
	
	public ArrayList<CalculPaie> calcule = new ArrayList<>();
	
	private int nbf ; 
	private float sum ; 
	private List<Float> listsomme;
	private String nom ;
	private String prenom ;
	private String corps ; 
	private String grade ;
	private long salairedebase ;
	private long somme  ;
	private long taux ;
	private long brute1 ; 
	private long brute2 ; 
	private long brute3 ; 
	private int nombreenfant ; 
	private long brutefinal ; 
	private long salairenet ; 
	private long netapaie ; 
	private long sandic ;
	private long assurance ;
	private long b ;
	private int x;
	
	
	
	public List <CalculPaie>claculer(int user){
		List<Fiche> fiche = ficheservice.findFicheByUser_id(user) ;
		List<TauxDeRetraite> tauxx = tauxservice.findAll() ; 
		List<SubventionSpeciale> sub = subservice.findAll();
			calcule.clear();
			for(Fiche f : fiche ) {
				for (TauxDeRetraite t :tauxx ) {
					for(SubventionSpeciale s : sub) {
						user = f.getUser().getId();
						nom = f.getNom();
						prenom = f.getPrenom();
						grade = f.getGrade().getLibelle();
						corps = f.getCorps().getLibelle();
						salairedebase = f.getSalaire();
						x = f.getGrade().getCorps().getId();
						if( f.getGrade().getCorps().getId() == f.getCorps().getId() ) {
							listsomme.add(s.getMontantSubvention());
							 for(int i = 0; i < listsomme.size(); i++)
							        
							 somme = (long)sum;
						}else somme = x;
						taux = (long)t.getRetraite() + (long)t.getPrevoyancesociale() + (long)t.getCapitaledeces();
						brute1 = salairedebase + somme ; 
						brute2 =(brute1 * taux)/100 ; 
						b= brute1 - brute2 ;
						nbf = f.getNbreEnfants();
						if (nbf != 0) {
							nombreenfant = f.getNbreEnfants() *100+100;
						}else {
							nombreenfant = nbf;
						}
						brute3 =b *(long)12.9 - nombreenfant ; 
						brutefinal = (brute3 * 20 /100)/12 ;
						salairenet = brute1 - brute2 + brutefinal ;
						sandic = (long)t.getSyndic();
						assurance = (long)t.getAssurance();
						netapaie = salairenet - sandic + assurance ; 
					}
				}
				calcule.add(new CalculPaie(nom, prenom, corps, grade,salairedebase, somme, taux, brute1, brute2, brute3, nombreenfant, brutefinal, salairenet, netapaie, sandic, assurance, user));	
			}
			
			return calcule;
}
	public List <CalculPaie>claculeRayen(){
		List<Fiche> fiche = ficheservice.findAll() ;
		List<TauxDeRetraite> tauxx = tauxservice.findAll() ; 
		List<SubventionSpeciale> sub = subservice.findAll();
			calcule.clear();
			for(Fiche f : fiche ) {
				for (TauxDeRetraite t :tauxx ) {
					for(SubventionSpeciale s : sub) {
						nom = f.getNom();
						prenom = f.getPrenom();
						grade = f.getGrade().getLibelle();
						corps = f.getCorps().getLibelle();
						salairedebase = f.getSalaire();
						somme = 1;
						taux = (long)t.getRetraite() + (long)t.getPrevoyancesociale() + (long)t.getCapitaledeces();
						brute1 = salairedebase + somme ; 
						brute2 =(brute1 * taux)/100 ; 
						b= brute1 - brute2 ;
						nbf = f.getNbreEnfants();
						if (nbf != 0) {
							nombreenfant = f.getNbreEnfants() *100+100;
						}else {
							nombreenfant = nbf;
						}
						brute3 =b *(long)12.9 - nombreenfant ; 
						brutefinal = (brute3 * 20 /100)/12 ;
						salairenet = brute1 - brute2 + brutefinal ;
						sandic = (long)t.getSyndic();
						assurance = (long)t.getAssurance();
						netapaie = salairenet - sandic + assurance ; 
					}
				}
				calcule.add(new CalculPaie(nom, prenom, corps, grade,salairedebase, somme, taux, brute1, brute2, brute3, nombreenfant, brutefinal, salairenet, netapaie, sandic, assurance, 2));	
			}
			
			return calcule;
}
	}


