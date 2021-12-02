//package manager;
//
//
//import java.util.Iterator;
//import java.util.List;
//
//import javax.persistence.Query;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.boot.MetadataSources;
//import org.hibernate.boot.registry.StandardServiceRegistry;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
//
//import entities.Employee;
//
//
//public class EmployeeManager  {
//	
//	protected SessionFactory sessionFactory ; 
//	
//	
//	protected void setup() {
//		// le code qui me permet de load une session hibernate 
//		//on recupere la conf hibernate pour creer un registry
//		// Attention : ici on se connecte pas donc on ne lance pas de session à la bdd
//		
//		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
//	
//		try {
//			sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
//			
//			} catch(Exception ex) {
//				StandardServiceRegistryBuilder.destroy(registry);
//				ex.getStackTrace();
//			}
//	}
//	
//	protected void exit() {
//		// le code pour supprimer une session
//		sessionFactory.close();
//	}
//	
//	
//	protected List<Employee> findAll() {
//		// lire enregistrement
//	Session session = sessionFactory.openSession();
//	
//	// quand pas de modif sur base pas de transaction
//	Query query = session.createQuery("select e from Employee e ");
//	
//	List<Employee> employees = query.getResultList();
//	
//		for (Employee employee : employees) {
//			System.out.println("nom de employee " +employee.getNom() + " prenom employee "+employee.getPrenom());
//		}
//	
//				session.close();
//		return employees;
//}
//
//	
//	
//
//	
//	protected void update(long id ,Employee newEmployee) {
//			// update enregistrement
//		System.out.println("je récupére employee " + "id : " +id);
//		Employee employee = this.findById(id);
//		
//		if(newEmployee.getNom() != null ) {
//			employee.setNom(newEmployee.getNom());
//		}
//			
//		if(newEmployee.getPrenom() !=null ) {
//			employee.setPrenom(newEmployee.getPrenom());			
//		}	
//		if(newEmployee.getCourriel() != newEmployee.getCourriel()) {
//			employee.setCourriel(newEmployee.getCourriel());
//		}
//		if(newEmployee.getAge() != 0 ) {
//			employee.setAge(newEmployee.getAge());
//		}
//		
//		if(newEmployee.getFonction() !=null ) {
//			employee.setFonction(newEmployee.getFonction());			
//		}	
//		if(newEmployee.getTel() != newEmployee.getTel()) {
//			employee.setTel(newEmployee.getTel());
//		}
//		if(newEmployee.getAdresse() != newEmployee.getAdresse()) {
//			employee.setAdresse(newEmployee.getAdresse());
//		}
//
//				
//		
//		Session session = sessionFactory.openSession();
//		session.beginTransaction();
//		session.update(employee);
//		session.getTransaction().commit();
//		session.close();
//				
//		}
//	
//	protected void delete(Employee employee ) {
//		
//		// supprimer enregistrement .
//		Session session = sessionFactory.openSession();
//		session.beginTransaction();
//		session.delete(employee);
//		session.getTransaction().commit();
//		session.close();
//			
//	}
//	
//	public static void main(String[] args) {
//		
//		EmployeeManager manager = new EmployeeManager(); 
//		manager.setup();
////		manager.create();
//		
//		
//		Employee newEmployee = new Employee(); 
//		newEmployee.setNom("jose");
//		
//		
//		
//		long id =2 ; 
//		
//	
////		manager.setup();
//		//manager.create();
//		//Employee employee = manager.findById(2);
//
//		manager.update(id,newEmployee);
//		manager.findAll();
////		manager.delete(employee);
//		manager.exit();
//			
//	}
//}
