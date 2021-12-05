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
import entities.Secteur;
import service.HibernateUtil;

public class SecteurRepositoryImpl {

	
	public void deleteEmploy(long id) {
		
		// non persistant Object 
		Secteur secteur = new Secteur();
		secteur.setId(id);
		
		// persistant obj : 
		Secteur secteur1 = this.findById(id);
		
		
		
		//  recupere session courante . 	
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
	
		
		// supression obj persistant 
		session.delete(secteur1);
		System.out.println("secteur supprimé ");
	
	}
	
	
	
	/**
	 * créer un secteur
	 * @param employee type Employee
	 */
	public void create(Secteur secteur) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.persist(secteur);
	}
	
	
	
	
	
	
	
	
	/**
	 *  get employee by id 
	 * @param id
	 * @return Employee employee
	 */
	
	public Secteur findById(long id) {
		Secteur secteur =null;
		Session session = null ; 
		
		session = HibernateUtil.getSessionFactory().getCurrentSession();
		secteur = session.get(Secteur.class, id);
			
		return secteur ; 
	}	
	
	
	
	
	
	/**
	 * getAll elements of data base 
	 * @return list of employes List<Employee>
	 */
	public List<Secteur> findAll() {
		List<Secteur> secteur=null;
		Session session = null ; 
		
		session = HibernateUtil.getSessionFactory().getCurrentSession();

			 Query query = session.createQuery("from Secteur ");
			 secteur = query.getResultList();
			
			
//			session = HibernateUtil.getSessionFactory().openSession();
//			 CriteriaBuilder cb = session.getCriteriaBuilder(); 
//			 CriteriaQuery<Employee> cr = cb.createQuery(Employee.class);
//			 Root<Employee> root = cr.from(Employee.class); 
//			 cr.select(root);
//			 Query query = session.createQuery(cr); 
//			 results = query.getResultList();
			 
			 
	
		return secteur; 
	}	
	
	
	
	
	
	

}

