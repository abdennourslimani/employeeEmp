package Controller;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import dto.EmployeeFullDto;
import entities.Employee;
import repository.EmployeeRepositoryImpl;
import service.EmployeeService;

public class EmployeeController {

	private EmployeeService employeeService ; 

			// valoriser employee service avec constructeur 
			public EmployeeController() {
				this.employeeService = new EmployeeService();		
			}
			
			
			
			
			
			
			
			
			/**
			 * create employee 
			 * @param employee
			 */
			public void createEmpl(Employee employee) {
				employeeService.createEmployee(employee);
			}
			
			
			/**
			 * get employee by id  avec JOIN 
			 */
			
			public void getEmployeeWithoutSecteur() {
					
					Scanner scanner = new Scanner(System.in);
					System.out.println("quel est l'id de employee que vous voulez afficher ses coordonnées");
					long id = scanner.nextLong();
					Employee employee = employeeService.getEmployeeLight(id);
					// pas accés à la valeur du tournoi 
					System.out.println(employee.getSecteur().getNom());

			}
			
			
			/**
			 * get employee by id  sans JOIN 
			 */
			
			public void getEmployeeWithSecteur() {
					
					Scanner scanner = new Scanner(System.in);
					System.out.println("quel est l'id de employee que vous voulez afficher ses coordonnées");
					long id = scanner.nextLong();
					EmployeeFullDto employee = employeeService.getEmployeeFull(id);
					System.out.println( " je suis le  nom du secteur "+employee.getSecteur().getNom());
			
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
				
			/**
			 * delete employee
			 * @param id
			 */
			public void deleteEmployee(long id) {
				
				employeeService.deleteEmployee(id);
			}
				
			
			
	
	
	
	
	
	
	
	// find All
	public void getEmployees() {
		
		List<Employee> employees  = employeeService.getEmployees();
		
		
		// afficher les noms des employés de la boite 
		employees.stream().forEach(employee ->{
			
			System.out.println(" le nom des employées : " +  employee.getNom());
			
		});
	}
	
	
//	public void updateEmployee(id) {
//		
////		employeeService.updateEmploy(id);
////	}
//	
	
	
	
	
	
	
}
