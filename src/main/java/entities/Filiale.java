package entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="filiale")
public class Filiale {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nom; 
	
	 @ManyToOne
     @JoinColumn(name="entreprise_id")
	private Entreprise entreprise;
	
	
	

	@OneToMany(mappedBy="filiale" ,cascade = CascadeType.ALL)
	private Set<Employee> employees;
	
	
	
}
