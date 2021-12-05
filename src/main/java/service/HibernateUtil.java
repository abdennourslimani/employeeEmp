package service;

import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

// pouravoir des sessions on utilise session factory 
// c est objet session a qui on demande de lire et ecrire 
// classe dedié à conserver objet session factory 
public class HibernateUtil {
	
	// initialisation de la classe pour valoriser session factory
	private static final SessionFactory sessionFactory= buildSessionFactory(); 

	
	
	
	private static SessionFactory buildSessionFactory() {
		
		try {
			// recupere cfg.xml le lire et build notre  object session factory 
			return new Configuration().configure().buildSessionFactory();
			
			} catch(Throwable ex) {
				throw new ExceptionInInitializerError(ex);
			}
	}
	
	// methode pour recuperer session factory 
	public static SessionFactory getSessionFactory() {
		
		return sessionFactory;
	}
	
}


