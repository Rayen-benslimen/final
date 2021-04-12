package com.pfe.GestionBank.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "subventionspeciale")
public class SubventionSpeciale implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	@JoinColumn(name = "corps_id", nullable = false)
	private Corps corps;
	@ManyToOne
	@JoinColumn(name = "grade_id", nullable = false)
	private Grade grade;
	@ManyToOne
	@JoinColumn(name = "subvention_id", nullable = false)
	private Subvention subvention;
	private float montantSubvention;
	
	public SubventionSpeciale(Corps corps, Grade grade, Subvention subvention, float montantSubvention) {
		this.corps = corps;
		this.grade = grade;
		this.subvention = subvention;
		this.montantSubvention = montantSubvention;
	}
	
	public SubventionSpeciale() {
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Subvention getSubvention() {
		return subvention;
	}
	public void setSubvention(Subvention subvention) {
		this.subvention = subvention;
	}
	public float getMontantSubvention() {
		return montantSubvention;
	}
	public void setMontantSubvention(float montantSubvention) {
		this.montantSubvention = montantSubvention;
	}
	
	
	

}
