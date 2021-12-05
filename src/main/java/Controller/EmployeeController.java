package Controller;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

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
			 * get employee by id 
			 */
			
			public void getEmployeeWithout() {
					
					Scanner scanner = new Scanner(System.in);
					System.out.println("quel est l'id de employee que vous voulez afficher ses coordonn�es");
					long id = scanner.nextLong();
					Employee employee = employeeService.getEmployeeLight(id);
					
			
			}
			
			
			/**
			 * get employee by id 
			 */
			
			public void getEmployeeWithSecteur() {
					
					Scanner scanner = new Scanner(System.in);
					System.out.println("quel est l'id de employee que vous voulez afficher ses coordonn�es");
					long id = scanner.nextLong();
					Employee employee = employeeService.getEmployeeFull(id);
					System.out.println(employee.getSecteur().getNom());
			
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
		
		
		// afficher les noms des employ�s de la boite 
		employees.stream().forEach(employee ->{
			
			System.out.println(" le nom des employ�es : " +  employee.getNom());
			
		});
	}
	
	
//	public void updateEmployee(id) {
//		
////		employeeService.updateEmploy(id);
////	}
//	
	
	
	
	
	
	
}
