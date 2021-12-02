package repository;

import java.util.Iterator;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;



import entities.Employee;
import service.HibernateUtil;

public class EmployeeRepositoryImpl {

	
	public void deleteEmploy(long id) {
		
		// non persistant Object 
		Employee employee = new Employee();
		employee.setId(id);
		
		// persistant obj : 
		Employee employee1 = this.findById(id);
		
		
		
		// supprimer enregistrement .	
		Session session = HibernateUtil.getSessionFactory().openSession();
		System.out.println(employee.getNom() + " avant suppression  avec id " + employee.getId());
		System.out.println(employee1.getNom());
		session.delete(employee);
		System.out.println("tournoir supprimé ");
	
	}
	
	
	
	/**
	 * créer un employée 
	 * @param employee type Employee
	 */
	public void create(Employee employee) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		System.out.println(employee.getNom());
		session.save(employee);
		session.close();
	}
	
	
	
//	public void updateEmp(long id ,Employee newEmployee) {
//		
//		// update enregistrement
//		System.out.println("je récupére employee " + "id : " +id);
//		Employee employee = this.findById(id);
//	
//		
//		if(newEmployee.getNom() != null ) {
//			employee.setNom(newEmployee.getNom());
//	}			
//		if(newEmployee.getPrenom() !=null ) {
//			employee.setPrenom(newEmployee.getPrenom());			
//	}	
//	if(newEmployee.getCourriel() != newEmployee.getCourriel()) {
//			employee.setCourriel(newEmployee.getCourriel());
//		}
//		if(newEmployee.getAge() != 0 ) {
//			employee.setAge(newEmployee.getAge());
//		}
//		
//		if(newEmployee.getFonction() !=null ) {
//		employee.setFonction(newEmployee.getFonction());			
//	}	
//		if(newEmployee.getTel() != newEmployee.getTel()) {
//			employee.setTel(newEmployee.getTel());
//		}
//		if(newEmployee.getAdresse() != newEmployee.getAdresse()) {
//			employee.setAdresse(newEmployee.getAdresse());
//		}
//		
//		
//		
//		
//		
//		Session session = HibernateUtil.getSessionFactory().openSession();
//		session.update();
//		session.close();
//	}
	
	
	
	
	
	
	/**
	 *  get employee by id 
	 * @param id
	 * @return Employee employee
	 */
	
	public Employee findById(long id) {
		Employee employee =null;
		Session session = null ; 
		
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			employee = session.get(Employee.class, id);

		
		}catch(Throwable t){
			t.printStackTrace();
		}finally {
			if(session != null) {
				session.close();
			}
		}
		return employee ; 
	}	
	
	
	/**
	 * getAll elements of data base 
	 * @return list of employes List<Employee>
	 */
	public List<Employee> findAll() {
		List<Employee> results =null;
		Session session = null ; 
		
		try {
//			Query query = session.createQuery("select e from Employee e ");
//			 employees = query.getResultList();
			
			
			session = HibernateUtil.getSessionFactory().openSession();
			 CriteriaBuilder cb = session.getCriteriaBuilder(); 
			 CriteriaQuery<Employee> cr = cb.createQuery(Employee.class);
			 Root<Employee> root = cr.from(Employee.class); 
			 cr.select(root);
			 Query query = session.createQuery(cr); 
			 results = query.getResultList();
			 
			 
			 
		}catch(Throwable t){
			t.printStackTrace();
		}finally {
			if(session != null) {
				session.close();
			}
		}
		return results; 
	}	
	
	
	
	
	
	

}

