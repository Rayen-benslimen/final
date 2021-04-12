package com.pfe.GestionBank.entity;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;
@Entity
@Table(name="fiche")
public class Fiche implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String prenom;
    private String lieu;
    private String adresse;
    private String email;
    private String etatCivile;
    private String niveau;
    private int nbreEnfants;
    private int salaire;
    private String rib;
    private Date dateDeNaissance;
	@ManyToOne
	@JoinColumn(name = "bank_id", nullable = false)
    private Bank bank;
	@ManyToOne
	@JoinColumn(name = "corps_id", nullable = false)
    private Corps corps;
	@ManyToOne
	@JoinColumn(name = "grade_id", nullable = false)
    private Grade grade;
	@ManyToOne
	@JoinColumn(name = "affectation_id", nullable = false)
    private Affectation affectation;
	@ManyToOne
	@JoinColumn(name = "user_id", nullable = false)
	private User user ;
    
    public Fiche(String nom, String prenom, String lieu, String adresse, String email, String etatCivile,
    			 String niveau, int nbreEnfants, Date dateDeNaissance, Bank bank, Corps corps , Grade grade,
    			 Affectation affectation, String rib , User user) {
    	this.nom = nom;
    	this.rib = rib;
    	this.prenom = prenom;
    	this.lieu = lieu;
    	this.adresse = adresse;
    	this.email = email;
    	this.etatCivile = etatCivile;
    	this.niveau = niveau;
    	this.nbreEnfants = nbreEnfants;
    	this.dateDeNaissance = dateDeNaissance;
    	this.bank = bank;
    	this.corps = corps;
    	this.grade= grade;
    	this.affectation = affectation;
    	this.user = user ;
    	
    }
    
    public Fiche() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getRib() {
		return rib;
	}

	public void setRib(String rib) {
		this.rib = rib;
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

	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEtatCivile() {
		return etatCivile;
	}

	public void setEtatCivile(String etatCivile) {
		this.etatCivile = etatCivile;
	}

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

	public int getNbreEnfants() {
		return nbreEnfants;
	}

	public void setNbreEnfants(int nbreEnfants) {
		this.nbreEnfants = nbreEnfants;
	}

	public int getSalaire() {
		return salaire;
	}

	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}

	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public Corps getCorps() {
		return corps;
	}

	public void setCorps(Corps corps) {
		this.corps = corps;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	public Affectation getAffectation() {
		return affectation;
	}

	public void setAffectation(Affectation affectation) {
		this.affectation = affectation;
	}
	
	public  User getUser() {
		return user ; 
	}
	
	public void setUser(User user) {
		this.user = user ; 
	}
    
    
}
