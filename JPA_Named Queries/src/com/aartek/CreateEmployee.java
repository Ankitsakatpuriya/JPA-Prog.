package com.aartek;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class CreateEmployee {

	public static void main(String[] args) {

		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("jp");

		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();

		  Query query = entitymanager.createNamedQuery("find employee by id");
	      
	      query.setParameter("id", 1204);
	      List<Employee> list = query.getResultList( );
	      
	      for( Employee e:list ){
	         System.out.print("Employee ID :" + e.getEid( ));
	         System.out.println("\t Employee Name :" + e.getEname( ));

		
	}
}}