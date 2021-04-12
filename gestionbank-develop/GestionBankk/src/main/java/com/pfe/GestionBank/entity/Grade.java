package com.pfe.GestionBank.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="grade")
public class Grade implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique=true, nullable=false)
    private String code;
    private String libelle;
	@ManyToOne
	@JoinColumn(name = "corps_id", nullable = false)
    private Corps corps;
    
    public Grade(String code,String libelle, Corps corps) {
    	this.code = code;
    	this.libelle = libelle;
    	this.corps = corps;
    }
    
    public Grade() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Corps getCorps() {
		return corps;
	}

	public void setCorps(Corps corps) {
		this.corps = corps;
	}
    
    
}
