package com.pfe.GestionBank.entity;

import lombok.Data;


@Data
public class CalculPaie {
	
	private String nom ;
	private String prenom ;
	private String corps ; 
	private String grade ;
	private long salairedebase ;
	private float somme  ;
	private long taux ;
	private float brute1 ; 
	private float brute2 ; 
	private float brute3 ; 
	private int nombreenfant ; 
	private float brutefinal ; 
	private float salairenet ; 
	private float netapaie ; 
	private float sandic ;
	private float assurance ;
	private int userid ; 
	
	


	public CalculPaie(String nom, String prenom, String corps, String grade, long salairedebase, float somme, long taux,
			float brute12, float brute22, float brute32, int nombreenfant, float brutefinal2, float salairenet2, float netapaie2,
			float sandic2, float assurance2 , int userid) {
		
		this.nom = nom;
		this.prenom = prenom;
		this.corps = corps;
		this.grade = grade;
		this.salairedebase = salairedebase;
		this.somme = somme;
		this.taux = taux;
		this.brute1 = brute12;
		this.brute2 = brute22;
		this.brute3 = brute32;
		this.nombreenfant = nombreenfant;
		this.brutefinal = brutefinal2;
		this.salairenet = salairenet2;
		this.netapaie = netapaie2;
		this.sandic = sandic2;
		this.assurance = assurance2;
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



	public float getSomme() {
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



	public float getBrute1() {
		return brute1;
	}



	public void setBrute1(long brute1) {
		this.brute1 = brute1;
	}



	public float getBrute2() {
		return brute2;
	}



	public void setBrute2(long brute2) {
		this.brute2 = brute2;
	}



	public float getBrute3() {
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



	public float getBrutefinal() {
		return brutefinal;
	}



	public void setBrutefinal(long brutefinal) {
		this.brutefinal = brutefinal;
	}



	public float getSalairenet() {
		return salairenet;
	}



	public void setSalairenet(long salairenet) {
		this.salairenet = salairenet;
	}



	public float getNetapaie() {
		return netapaie;
	}



	public void setNetapaie(long netapaie) {
		this.netapaie = netapaie;
	}



	public float getSandic() {
		return sandic;
	}



	public void setSandic(long sandic) {
		this.sandic = sandic;
	}



	public float getAssurance() {
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
