import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import Controller.EmployeeController;
import Controller.SecteurController;
import entities.Employee;
import entities.Secteur;

public class Main {

	
	public static void main(String[] args) {
		
	EmployeeController emplController = new EmployeeController(); 
	SecteurController secteurController = new SecteurController(); 

//	Secteur secteur = new Secteur(); 
//	secteur.setNom("automobile");
//	secteur.setLocalisation("Grand Est");
//
//	Set<Employee> employees = new HashSet<Employee>();
//	
//	
//	Employee employee1 =new Employee();
//	employee1.setNom("abdennour");
//	employee1.setPrenom("slimani");
//	employee1.setCourriel("abdennour.slimani@icloud.com");
//	employee1.setAge(30);
//	employee1.setFonction("CTO");
//	employee1.setTel("0646589621");
//	employee1.setAdresse("25 rue du desert 75016");
//	employee1.setSecteur(secteur);
//	
//	Employee employee2 =new Employee();
//	employee1.setNom("jose");
//	employee1.setPrenom("fernando");
//	employee1.setCourriel("jo.fer@icloud.com");
//	employee1.setAge(30);
//	employee1.setFonction("DSI");
//	employee1.setTel("0646589341");
//	employee1.setAdresse("25 rue du chameau 75016");
//	employee1.setSecteur(secteur);
//
//	employees.add(employee1);	
//	employees.add(employee2);
//	
//	
//	secteur.setEmployees(employees);
//	
//	
//	
//	secteurController.createSecteur(secteur);
	

	// recuperer un employee . 
	//emplController.getEmployee();

	emplController.getEmployees();

	
	


	
	}
	
}
