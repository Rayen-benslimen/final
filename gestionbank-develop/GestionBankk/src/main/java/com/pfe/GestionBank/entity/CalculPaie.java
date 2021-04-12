package com.pfe.GestionBank.entity;

import lombok.Data;


@Data
public class CalculPaie {
	
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
	private int userid ; 
	
	


	public CalculPaie(String nom, String prenom, String corps, String grade, long salairedebase, long somme, long taux,
			long brute1, long brute2, long brute3, int nombreenfant, long brutefinal, long salairenet, long netapaie,
			long sandic, long assurance , int userid) {
		
		this.nom = nom;
		this.prenom = prenom;
		this.corps = corps;
		this.grade = grade;
		this.salairedebase = salairedebase;
		this.somme = somme;
		this.taux = taux;
		this.brute1 = brute1;
		this.brute2 = brute2;
		this.brute3 = brute3;
		this.nombreenfant = nombreenfant;
		this.brutefinal = brutefinal;
		this.salairenet = salairenet;
		this.netapaie = netapaie;
		this.sandic = sandic;
		this.assurance = assurance;
		this.userid = userid ;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public String getCorps() {
		return corps;
	}



	public void setCorps(String corps) {
		this.corps = corps;
	}



	public String getGrade() {
		return grade;
	}



	public void setGrade(String grade) {
		this.grade = grade;
	}



	public long getSalairedebase() {
		return salairedebase;
	}



	public void setSalairedebase(long salairedebase) {
		this.salairedebase = salairedebase;
	}



	public long getSomme() {
		return somme;
	}



	public void setSomme(long somme) {
		this.somme = somme;
	}



	public long getTaux() {
		return taux;
	}



	public void setTaux(long taux) {
		this.taux = taux;
	}



	public long getBrute1() {
		return brute1;
	}



	public void setBrute1(long brute1) {
		this.brute1 = brute1;
	}



	public long getBrute2() {
		return brute2;
	}



	public void setBrute2(long brute2) {
		this.brute2 = brute2;
	}



	public long getBrute3() {
		return brute3;
	}



	public void setBrute3(long brute3) {
		this.brute3 = brute3;
	}



	public int getNombreenfant() {
		return nombreenfant;
	}



	public void setNombreenfant(int nombreenfant) {
		this.nombreenfant = nombreenfant;
	}



	public long getBrutefinal() {
		return brutefinal;
	}



	public void setBrutefinal(long brutefinal) {
		this.brutefinal = brutefinal;
	}



	public long getSalairenet() {
		return salairenet;
	}



	public void setSalairenet(long salairenet) {
		this.salairenet = salairenet;
	}



	public long getNetapaie() {
		return netapaie;
	}



	public void setNetapaie(long netapaie) {
		this.netapaie = netapaie;
	}



	public long getSandic() {
		return sandic;
	}



	public void setSandic(long sandic) {
		this.sandic = sandic;
	}



	public long getAssurance() {
		return assurance;
	}



	public void setAssurance(long assurance) {
		this.assurance = assurance;
	}



	public int getUserid() {
		return userid;
	}



	public void setUserid(int userid) {
		this.userid = userid;
	}
	
	

	

	
	
	
	

}
