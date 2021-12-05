package dto;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import entities.Employee;
import entities.Entreprise;

public class FilialeDto {


	private long id;
	private String nom; 
	

//	private EntrepriseDtoSansFiliale entreprise;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


//	public EntrepriseDtoSansFiliale getEntreprise() {
//		return entreprise;
//	}
//
//
//	public void setEntreprise(EntrepriseDtoSansFiliale entreprise) {
//		this.entreprise = entreprise;
//	}
	
	
	
	
}
