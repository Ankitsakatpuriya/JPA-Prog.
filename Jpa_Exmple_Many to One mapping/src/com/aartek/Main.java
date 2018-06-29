package com.aartek;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
 
public class Main {
 
	public static void main(String[] args) {
 
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jp");
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
 
		Employee employee = new Employee();
		employee.setEmail("ompatidar@gmail.com");
		employee.setFirstname("om");
		employee.setLastname("Patidar");
		
		Department d2 = new Department();
		d2.setIddepartment(2);
		d2.setName("Laptop");
		em.persist(d2);
	
		txn.begin();
		Department department = em.find(Department.class, 2);
		System.out.println(department);
		txn.commit();
 
		employee.setDepartment(department);
 
		txn.begin();
		em.persist(employee);
		txn.commit();
 
	}
 
}