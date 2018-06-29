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

		/*
		 * Employee employee = new Employee( ); employee.setEid( 1206 );
		 * employee.setEname( "Swati" ); employee.setSalary( 650000 ); employee.setDeg(
		 * "Spring Dev." );
		 * 
		 * entitymanager.persist( employee );
		 * 
		 * entitymanager.getTransaction( ).commit( );
		 * 
		 * entitymanager.close( ); emfactory.close( );
		 */

		/* Update Employee Table */

		/*
		 * Employee employee = entitymanager.find( Employee.class, 1201 );
		 * 
		 * //before update System.out.println( employee ); employee.setSalary( 400000 );
		 * entitymanager.getTransaction( ).commit( );
		 * 
		 * //after update System.out.println( employee ); entitymanager.close();
		 * emfactory.close();
		 * 
		 * 
		 */

		// Find Query Only One Person

	
		 Employee employee = entitymanager.find( Employee.class, 1201 );
		  
		  System.out.println("employee ID = " + employee.getEid( ));
		  System.out.println("employee NAME = " + employee.getEname( ));
		  System.out.println("employee SALARY = " + employee.getSalary( ));
		  System.out.println("employee DESIGNATION = " + employee.getDeg( ));
		 

		/* Delete Query With jpa */
		/*
		 * Employee employee = entitymanager.find(Employee.class, 1202);
		 * entitymanager.remove(employee); entitymanager.getTransaction().commit();
		 * entitymanager.close(); emfactory.close();
		 */
				
	
}}