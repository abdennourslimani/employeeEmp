package repository;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

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
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.persist(employee);
	}
	
	
	
	
	
	
	
	
	/**
	 *  get employee by id 
	 * @param id
	 * @return Employee employee
	 */
	
	public Employee findById(long id) {
		Employee employee =null;
		Session session = null ; 
		
			session = HibernateUtil.getSessionFactory().openSession();
			employee = session.get(Employee.class, id);
			
		return employee ; 
	}	
	
	
	
	
	
	/**
	 * getAll elements of data base 
	 * @return list of employes List<Employee>
	 */
	public List<Employee> findAll() {
		List<Employee> employees =null;
		Session session = null ; 
		
		session = HibernateUtil.getSessionFactory().openSession();

			 Query query = session.createQuery("from Employee ");
			 employees = query.getResultList();
			
			
//			session = HibernateUtil.getSessionFactory().openSession();
//			 CriteriaBuilder cb = session.getCriteriaBuilder(); 
//			 CriteriaQuery<Employee> cr = cb.createQuery(Employee.class);
//			 Root<Employee> root = cr.from(Employee.class); 
//			 cr.select(root);
//			 Query query = session.createQuery(cr); 
//			 results = query.getResultList();
			 
			 
	
		return employees; 
	}	
	
	
	
	
	
	

}

