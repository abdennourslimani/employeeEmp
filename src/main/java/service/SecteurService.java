package service;

import java.util.Set;

import org.hibernate.Session;

import com.google.protobuf.Service;

import entities.Employee;
import entities.Secteur;
import repository.SecteurRepositoryImpl;

public class SecteurService {

	
private SecteurRepositoryImpl secteurRepository ; 
	
	
	public SecteurService() {
		this.secteurRepository = new SecteurRepositoryImpl();		
	}
	
	
	
	/**
	 * create service . 
	 * @param service
	 */
	public void createSecteur(Secteur secteur) {
	Session session = null ; 
	
	
	session = HibernateUtil.getSessionFactory().openSession();
	session.beginTransaction();
	secteurRepository.create(secteur);
	session.getTransaction().commit();
	session.close();
	
	System.out.println("ajout de l'lement");
	}
	

	
}
