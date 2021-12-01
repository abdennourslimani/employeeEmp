package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="employee")
public class Employee {
		
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private long id ; 
	private String nom; 
	private String prenom; 
	private String courriel; 
	private int  age; 
	private String fonction;
	private String   tel;
	private String adresse;
	
	
	
	
	public Employee() {
		super();
	}




	public Employee(long id, String nom, String prenom, String courriel, int age, String fonction, String tel,String adresse) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.courriel = courriel;
		this.age = age;
		this.fonction = fonction;
		this.tel = tel;
		this.adresse = adresse;
	}



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


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}




	public String getCourriel() {
		return courriel;
	}


	public void setCourriel(String courriel) {
		this.courriel = courriel;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

	public String getFonction() {
		return fonction;
	}



	public void setFonction(String fonction) {
		this.fonction = fonction;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	
}
