package com.pfe.GestionBank.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tauxretraite")
public class TauxDeRetraite implements Serializable {
		private static final long serialVersionUID = 1L;
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private float retraite;
		private float prevoyancesociale;
		private int capitaledeces;
		private float assurance;
		private float syndic;
		
		public TauxDeRetraite(float retraite, float prevoyancesociale, int capitaledeces, float assurance,
				float syndic) {
			this.retraite = retraite;
			this.prevoyancesociale = prevoyancesociale;
			this.capitaledeces = capitaledeces;
			this.assurance = assurance;
			this.syndic = syndic;
		}
		
		public TauxDeRetraite() {
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public float getRetraite() {
			return retraite;
		}

		public void setRetraite(float retraite) {
			this.retraite = retraite;
		}

		public float getPrevoyancesociale() {
			return prevoyancesociale;
		}

		public void setPrevoyancesociale(float prevoyancesociale) {
			this.prevoyancesociale = prevoyancesociale;
		}

		public int getCapitaledeces() {
			return capitaledeces;
		}

		public void setCapitaledeces(int capitaledeces) {
			this.capitaledeces = capitaledeces;
		}

		public float getAssurance() {
			return assurance;
		}

		public void setAssurance(float assurance) {
			this.assurance = assurance;
		}

		public float getSyndic() {
			return syndic;
		}

		public void setSyndic(float syndic) {
			this.syndic = syndic;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		
}
