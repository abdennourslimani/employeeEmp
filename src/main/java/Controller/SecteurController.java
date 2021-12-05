package Controller;

import entities.Employee;
import entities.Secteur;
import service.EmployeeService;
import service.SecteurService;

public class SecteurController {
	
	
	private SecteurService secteurService ; 

	// valoriser employee service avec constructeur 
	public SecteurController() {
		this.secteurService = new SecteurService();		
	}
	
	
	/**
	 * create employee 
	 * @param employee
	 */
	public void createSecteur(Secteur secteur) {
		secteurService.createSecteur(secteur);
	}
	
	
	

}
