package dto;



import entities.Filiale;
import entities.Secteur;

public class EmployeeFullDto {

	
	
	private long id ; 
	private String nom; 
	private String prenom; 
	private String courriel; 
	private int  age; 
	private String fonction;
	private String   tel;
	private String adresse;
	
	
	private SecteurDto secteur; 
	 

	private FilialeDto filiale;
	
	
	
	
	


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




	public SecteurDto getSecteur() {
		return secteur;
	}




	public void setSecteur(SecteurDto secteur) {
		this.secteur = secteur;
	}




	public FilialeDto getFiliale() {
		return filiale;
	}




	public void setFiliale(FilialeDto filiale) {
		this.filiale = filiale;
	}




	
	
	
	
	
	
}
