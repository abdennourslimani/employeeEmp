package Controller;

import entities.Employee;
import repository.EmployeeRepositoryImpl;
import service.EmployeeService;

public class EmployeeController {

	private EmployeeService employeeService ; 

	// valoriser employee service avec constructeur 
	public EmployeeController() {
		this.employeeService = new EmployeeService();		
	}
	
	// create employ� .
	public void creerEmployee(Employee employee) {
		employeeService.createEmployee(employee);
	}
	
	// un employ� by Id	
	public void findEmployeeById(Long id) {
			
			employeeService.getEmployeeById(id);
		}
		
	// mon delete
	public void deleteEmployee(long id) {
		
		employeeService.deleteEmployee(id);
	}
		
	// find All
	public void allEmployees() {
		
		employeeService.getEmployees();
	}
	
}
