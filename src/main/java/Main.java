import Controller.EmployeeController;
import entities.Employee;

public class Main {

	
	public static void main(String[] args) {
		
	EmployeeController emplController = new EmployeeController(); 
	
	Employee employee1 =new Employee();
	employee1.setNom("abdennour");
	employee1.setPrenom("slimani");
	employee1.setCourriel("abdennour.slimani@icloud.com");
	employee1.setAge(30);
	employee1.setFonction("CTO");
	employee1.setTel("0646589621");
	employee1.setAdresse("25 rue du desert 75016");
	
	//emplController.creerEmployee(employee1);
	
	long id=8;

	emplController.deleteEmployee(id);

	emplController.allEmployees();

	
	}
	
}
