package entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

public class Filiale {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nom; 
	
	@Transient
	private Entreprise entreprise;
	
	
	
	@Transient
	@OneToMany(mappedBy="secteur" ,cascade = CascadeType.ALL)
	private Set<Employee> employees;
	
	
	
}
