package dto;

import java.util.Set;



public class SecteurDto {
	
	private long id;
	private String nom; 
	private String localisation ;

	//private Set<EmployeeFullDto> employees;
	
	
	
	
	
	
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
	public String getLocalisation() {
		return localisation;
	}
	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}
	
	
	
//	public Set<EmployeeFullDto> getEmployees() {
//		return employees;
//	}
//	public void setEmployees(Set<EmployeeFullDto> employees) {
//		this.employees = employees;
//	}
//	
//	
	
}
