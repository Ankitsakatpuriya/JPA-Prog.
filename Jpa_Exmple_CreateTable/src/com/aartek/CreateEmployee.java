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

		/* Create Employee Table */

		  Employee employee = new Employee( ); employee.setEid( 1206 );
		  employee.setEname( "Swati" ); employee.setSalary( 650000 ); employee.setDeg(
		  "Spring Dev." );
		  
		  entitymanager.persist( employee );
		  
		  entitymanager.getTransaction( ).commit( );
		  
		  entitymanager.close( ); emfactory.close( );
		 	
	}
}