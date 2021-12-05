package repository;

import org.hibernate.Session;

import entities.Secteur;
import service.HibernateUtil;

public class SecteurRepositoryImpl {


	public void create(Secteur secteur) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.save(secteur);
		session.close();
	}
	
	
	
	
	
	
}
