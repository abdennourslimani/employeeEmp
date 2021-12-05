package entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;



@Entity
@Table(name="entreprise")
public class Entreprise {
	
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nom; 
	
	@Transient
	@OneToMany(mappedBy="secteur" ,cascade = CascadeType.ALL)
	private Set<Filiale> filiales;

	
	
	
	
	

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


	public Set<Filiale> getFiliales() {
		return filiales;
	}


	public void setFiliales(Set<Filiale> filiales) {
		this.filiales = filiales;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
