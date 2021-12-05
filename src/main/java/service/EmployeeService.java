package service;


import java.util.List;
import java.util.Set;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

import entities.Employee;
import repository.EmployeeRepositoryImpl;

public class EmployeeService {
	
	
	private EmployeeRepositoryImpl employeeRepository ; 
	
	
	public EmployeeService() {
		this.employeeRepository = new EmployeeRepositoryImpl();		
	}
	
	
	
	
	public void createEmployee(Employee employee) {
		Session session = null ; 
		Transaction tx = null ; 
		try {
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			employeeRepository.create(employee);
			tx.commit();
			}catch (Exception e ) {
				if(tx !=null) {
					tx.rollback();
				}
				e.printStackTrace();
			}
			finally {
				if(session !=null) {
					session.close();
				}
			}
	}

	
			
			
			
	
	public void deleteEmployee(long id) {
		Session session = null ; 
		Transaction tx = null ; 
		
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			tx = session.beginTransaction();
			
			employeeRepository.deleteEmploy(id);

			//	Employee employee = employeeRepository.findById(id);
			//employeeRepository.deleteEmploy(employee);
			//System.out.println(employee.getNom() + "à supprimer avec id" + employee.getId());
			tx.commit();
			}catch (Exception e ) {
				if(tx !=null) {
					tx.rollback();
				}
				e.printStackTrace();
				
			}
			finally {
				if(session !=null) {
					session.close();
					
				}
			}
		
		
	
	}
	
	// 2 eme methode avec les lazy . 
	
	
	
	
	public Employee getEmployeeFull(Long id) {
	Session session = null ; 
	Transaction tx = null ; 
	Employee employee =null;
	try {
		session = HibernateUtil.getSessionFactory().getCurrentSession();
		tx = session.beginTransaction();
		employee = employeeRepository.findById(id);
		// on a id ici du secteur car fk  avant de faire appel au proxy  
		
		System.out.println(employee.getSecteur().getNom());
		Hibernate.initialize(employee.getSecteur()); // proxy hibernate
		tx.commit();
		}catch (Exception e ) {
			if(tx !=null) {
				tx.rollback();
			}
			e.printStackTrace();
		}
		finally {
			if(session !=null) {
				session.close();
			}
		}
		return employee;
	}
	
	
	public Employee getEmployeeLight(Long id) {
	Session session = null ; 
	Transaction tx = null ; 
	Employee employee =null;
	try {
		session = HibernateUtil.getSessionFactory().getCurrentSession();
		tx = session.beginTransaction();
		employee = employeeRepository.findById(id);
		//tx.commit();
		}catch (Exception e ) {
			if(tx !=null) {
				tx.rollback();
			}
			e.printStackTrace();
		}
		finally {
			if(session !=null) {
				session.close();
			}
		}
		return employee;
	}
	
	
	
	
	
	public List<Employee> getEmployees() {
	Session session = null ; 
	Transaction tx = null ; 
	List<Employee> employees =null;
	try {
		session = HibernateUtil.getSessionFactory().openSession();
		tx = session.beginTransaction();
		employees = employeeRepository.findAll();
		
	
		tx.commit();
		}catch (Exception e ) {
			if(tx !=null) {
				tx.rollback();
			}
			e.printStackTrace();
		}
		finally {
			if(session !=null) {
				session.close();
			}
		}
	
	return employees;
	}
	
	
	
	
};
	
	
	
	
	
	
//	
//	Employee employee1 = new Employee(); 
//	employee1.setNom("jose");
//	employee1.setPrenom("fernandez");
//	employee1.setCourriel("jose.fernandez@icloud.com");
//	employee1.setAge(20);
//	employee1.setFonction("securite");
//	employee1.setTel("0646321245");
//	employee1.setAdresse("25 rue du chameau 38540");
//
//	
//	
//
//	Employee employee2 = new Employee(); 
//	employee2.setNom("moahammed");
//	employee2.setPrenom("stanbouli");
//	employee2.setCourriel("momo.stanbouli@icloud.com");
//	employee2.setAge(25);
//	employee2.setFonction("CTO");
//	employee2.setTel("0646686749");
//	employee2.setAdresse("25 rue du louvre 64140");
//	
//	
//	Employee employee3 = new Employee(); 
//	employee3.setNom("XIUN ");
//	employee3.setPrenom("CHU");
//	employee3.setCourriel("XIUN.CHU@icloud.com");
//	employee3.setAge(24);
//	employee3.setFonction("Lead Dev");
//	employee3.setTel("0646325879");
//	employee3.setAdresse("33 rue de la madelaine 68540");
	
	
//	
//	Session session = sessionFactory.openSession();
//	session.beginTransaction();
//	session.save(employee1);
//	session.getTransaction().commit();
//	session.close();
//	
//	
//	Session session1 = sessionFactory.openSession();
//	session1.beginTransaction();
//	session1.save(employee2);
//	session1.getTransaction().commit();
//	session1.close();
//	
//	
//	Session session2 = sessionFactory.openSession();
//	session2.beginTransaction();
//	session2.save(employee3);
//	session2.getTransaction().commit();
//	session2.close();