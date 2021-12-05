package service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entities.Employee;
import entities.Entreprise;
import repository.EmployeeRepositoryImpl;
import repository.EntrepriseRepositoryImpl;

public class EntrepriseService {
	
private EntrepriseRepositoryImpl entrepriseRepository ; 
	
	
	public EntrepriseService() {
		this.entrepriseRepository = new EntrepriseRepositoryImpl();		
	}
	
	
	
	
	
	
	
	
	public List<Entreprise> getEntreprise() {
		Session session = null ; 
		Transaction tx = null ; 
		List<Entreprise> entreprises =null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			tx = session.beginTransaction();
			entreprises = entrepriseRepository.findAll();
			
		
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
		
		return entreprises;
		}
		

}
