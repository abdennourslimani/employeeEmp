package manager;


import java.util.Iterator;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import entities.Employee;


public class EmployeeManager  {
	
	protected SessionFactory sessionFactory ; 
	
	
	protected void setup() {
		// le code qui me permet de load une session hibernate 
		//on recupere la conf hibernate pour creer un registry
		// Attention : ici on se connecte pas donc on ne lance pas de session à la bdd
		
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
	
		try {
			// on essaie de se connecter à la BDD et on essaie de contruire une session
			sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
			
			/*
			 * Session session = sessionFactory.openSession(); // transaction j ouvre je f
			 * requete je commit et je ferme requette session.beginTransaction();
			 * session.getTransaction().commit(); session.close();
			 */
			
			
			
			} catch(Exception ex) {
				StandardServiceRegistryBuilder.destroy(registry);
				ex.getStackTrace();
			}
		
		
		
		
	}
	
	protected void exit() {
		// le code pour supprimer une session
		sessionFactory.close();
	}
	protected void create() {
		// create enregistrement
		
		Employee employee1 = new Employee(); 
		employee1.setNom("jose");
		employee1.setPrenom("fernandez");
		employee1.setCourriel("jose.fernandez@icloud.com");
		employee1.setAge(20);
		employee1.setFonction("securite");
		employee1.setTel("0646321245");
		employee1.setAdresse("25 rue du chameau 38540");

		
		

		Employee employee2 = new Employee(); 
		employee2.setNom("moahammed");
		employee2.setPrenom("stanbouli");
		employee2.setCourriel("momo.stanbouli@icloud.com");
		employee2.setAge(25);
		employee2.setFonction("CTO");
		employee2.setTel("0646686749");
		employee2.setAdresse("25 rue du louvre 64140");
		
		
		Employee employee3 = new Employee(); 
		employee3.setNom("XIUN ");
		employee3.setPrenom("CHU");
		employee3.setCourriel("XIUN.CHU@icloud.com");
		employee3.setAge(24);
		employee3.setFonction("Lead Dev");
		employee3.setTel("0646325879");
		employee3.setAdresse("33 rue de la madelaine 68540");
		
		
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(employee1);
		session.getTransaction().commit();
		session.close();
		
		
		Session session1 = sessionFactory.openSession();
		session1.beginTransaction();
		session1.save(employee2);
		session1.getTransaction().commit();
		session1.close();
		
		
		
		Session session2 = sessionFactory.openSession();
		session2.beginTransaction();
		session2.save(employee3);
		session2.getTransaction().commit();
		session2.close();
		
		
		
		
	}
	
	protected List<Employee> findAll() {
		// lire enregistrement
	Session session = sessionFactory.openSession();
	
	// quand pas de modif sur base pas de transaction
	Query query = session.createQuery("select e from Employee e ");
	
	List<Employee> employees = query.getResultList();
	
		for (Employee employee : employees) {
			System.out.println("nom de employee " +employee.getNom() + " prenom employee "+employee.getPrenom());
		}
	
				session.close();
		return employees;
}

	
	
	
	
	
	
	protected Employee findById(long id ) {
			// lire enregistrement
		Session session = sessionFactory.openSession();
		// quand pas de modif sur base pas de transaction
		Employee employee = session.get(Employee.class, id);
		
		System.out.println("Nom: " +employee.getNom() + " Prenom " + employee.getPrenom() + " courriel : " + employee.getCourriel() + "age : " + 
								employee.getAge() + "fonction " +  employee.getFonction() + "adresse : "+employee.getAdresse());
		session.close();
		return employee;
	}
	
	protected void update(long id ,Employee newEmployee) {
			// update enregistrement
		System.out.println("je récupére employee " + "id : " +id);
		Employee employee = this.findById(id);
		
		if(newEmployee.getNom() != null ) {
			employee.setNom(newEmployee.getNom());
		}
		
		if(newEmployee.getPrenom() !=null ) {
			employee.setPrenom(newEmployee.getPrenom());			
		}	
		if(newEmployee.getCourriel() != newEmployee.getCourriel()) {
			employee.setCourriel(newEmployee.getCourriel());
		}
		if(newEmployee.getAge() != 0 ) {
			employee.setAge(newEmployee.getAge());
		}
		
		if(newEmployee.getFonction() !=null ) {
			employee.setFonction(newEmployee.getFonction());			
		}	
		if(newEmployee.getTel() != newEmployee.getTel()) {
			employee.setTel(newEmployee.getTel());
		}
		if(newEmployee.getAdresse() != newEmployee.getAdresse()) {
			employee.setAdresse(newEmployee.getAdresse());
		}

				
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.update(employee);
		session.getTransaction().commit();
		session.close();
				
		}
	
	protected void delete(Employee employee ) {
		
		// supprimer enregistrement .
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.delete(employee);
		session.getTransaction().commit();
		session.close();
			
	}
	
	public static void main(String[] args) {
		
		EmployeeManager manager = new EmployeeManager(); 
		manager.setup();
//		manager.create();
		
		
		Employee newEmployee = new Employee(); 
		newEmployee.setNom("jose");
		long id =2 ; 
		
	
//		manager.setup();
		//manager.create();
		//Employee employee = manager.findById(2);

		manager.update(id,newEmployee);
		manager.findAll();
//		manager.delete(employee);
		manager.exit();
			
	}
}
