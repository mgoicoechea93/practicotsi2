package controllers;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

//import controllers.UserController;
import entities.User;

public class UserController {

//	private HashMap<String, User> usuarios;
	private static UserController instance = null;
	
//	private UserController() {	
////		this.usuarios = new HashMap<>();
//	}
	
	public static UserController getInstance() {
		if (instance == null) {
			instance = new UserController();
		}
		return instance;
	}
	
//	public boolean addUser(String username, String password, String email, String name, String lastname, Integer roleid) {
//	
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PracticoTSI2");
//		EntityManager em = emf.createEntityManager();
//		
//		em.getTransaction().begin();
//		User u = new User();
//		u.setName(name);
//		u.setLastname(lastname);
//		u.setEmail(email);
//		u.setUsername(username);
//		u.setPassword(password);
////		System.out.println(roleid);
//		em.persist(u);
//		em.getTransaction().commit();
//		return true;
//	}
//	
//	public User getUser(String username) {
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PracticoTSI2");
//		EntityManager em = emf.createEntityManager();
//		
//		try {
//			User u = em.getReference(User.class, username);
//			return u;
//		} catch (EntityNotFoundException e) {
//			System.out.println(e);
//			return null;
//		}
//		
//	}
	
	public List<User> getUsers() {
		
		System.out.println("llego al userController");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PracticoTSI2");
		EntityManager em = emf.createEntityManager();
		
		TypedQuery<User> query = em.createQuery("SELECT u FROM User u", User.class);
		List<User> users = query.getResultList();
		
		return users;
	}
	
//	public boolean ModifyUser(String username, String password, String email, String name, String lastname, Integer roleid) {
//		
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PracticoTSI2");
//		EntityManager em = emf.createEntityManager();
//		
//		em.getTransaction().begin();
//		try {
//			User u = em.getReference(User.class, username);
//			u.setName(name);
//			u.setLastname(lastname);
//			u.setEmail(email);
//			u.setUsername(username);
//			u.setPassword(password);
//			//System.out.println(roleid);
//			em.persist(u);
//			em.getTransaction().commit();
//			return true;
//			
//		} catch(EntityNotFoundException e) {
//			System.out.println("Entidad no encontrada");
//			return false;
//		}
//	}
	
//	public boolean DeletUser(String username) {
//		
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PracticoTSI2");
//		EntityManager em = emf.createEntityManager();
//		
//		em.getTransaction().begin();
//		try {
//			User u = em.getReference(User.class, username);
//			em.remove(u);
//			em.getTransaction().commit();
//			return true;
//			
//		} catch(EntityNotFoundException e) {
//			System.out.println("Entidad no encontrada");
//			return false;
//		}
//		
//	}
}

