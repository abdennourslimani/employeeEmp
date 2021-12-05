package repository;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;

import entities.Entreprise;
import service.HibernateUtil;

public class EntrepriseRepositoryImpl {

	public void deleteEntreprise(long id) {
		
		// non persistant Object 
		Entreprise entreprise = new Entreprise();
		entreprise.setId(id);
		
		// persistant obj : 
		Entreprise entreprise1 = this.findById(id);
		
		
		
		//  recupere session courante . 	
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
	
		
		// supression obj persistant 
		session.delete(entreprise1);
		System.out.println("tournoir supprimé ");
	
	}
	
	
	
	/**
	 * créer un employée 
	 * @param employee type Employee
	 */
	public void create(Entreprise entreprise) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.persist(entreprise);
	}
	
	
	
	
	
	
	
	
	/**
	 *  get employee by id 
	 * @param id
	 * @return Employee employee
	 */
	
	public Entreprise findById(long id) {
		Entreprise entreprise =null;
		Session session = null ; 
		
		session = HibernateUtil.getSessionFactory().getCurrentSession();
		entreprise = session.get(Entreprise.class, id);
			
		return entreprise ; 
	}	
	
	
	
	
	
	/**
	 * getAll elements of data base 
	 * @return list of employes List<Employee>
	 */
	public List<Entreprise> findAll() {
		List<Entreprise> entreprises =null;
		Session session = null ; 
		
		session = HibernateUtil.getSessionFactory().getCurrentSession();

			 Query query = session.createQuery("from Entreprise ");
			 entreprises = query.getResultList();
			
			
//			session = HibernateUtil.getSessionFactory().openSession();
//			 CriteriaBuilder cb = session.getCriteriaBuilder(); 
//			 CriteriaQuery<Employee> cr = cb.createQuery(Employee.class);
//			 Root<Employee> root = cr.from(Employee.class); 
//			 cr.select(root);
//			 Query query = session.createQuery(cr); 
//			 results = query.getResultList();
			 
			 
	
		return entreprises; 
	}	
	
}
