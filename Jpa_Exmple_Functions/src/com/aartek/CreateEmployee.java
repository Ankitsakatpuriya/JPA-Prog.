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


		/*
		 * // Scalar function
		 * 
		 * // Scalar and Aggregate Functions
		 * 
		 * Query query =
		 * entitymanager.createQuery("Select UPPER(e.ename) from Employee e");
		 * List<String> list = query.getResultList();
		 * 
		 * for (String e : list) { System.out.println("Employee NAME :" + e); }
		 * 
		 * // Aggregate function Query query1 =
		 * entitymanager.createQuery("Select MAX(e.salary) from Employee e"); Double
		 * result = (Double) query1.getSingleResult();
		 * System.out.println("Max Employee Salary :" + result);
		 */

		// Between, And, Like Keywords

		/*
		 * //Between
		 * 
		 * Query query = entitymanager.createQuery( "Select e " + "from Employee e " +
		 * "where e.salary " + "Between 60000 and 400000" );
		 * 
		 * List<Employee> list=(List<Employee>)query.getResultList( );
		 * 
		 * for( Employee e:list ){ System.out.print("Employee ID :" + e.getEid( ));
		 * System.out.println("\t Employee salary :" + e.getSalary( )); }
		 * 
		 * 
		 */
		/*
		 * //Like Query query1 = entitymanager.createQuery("Select e " +
		 * "from Employee e " + "where e.ename LIKE 'P%'");
		 * 
		 * List<Employee> list1=(List<Employee>)query1.getResultList( );
		 * 
		 * for( Employee e:list1 ) {
		 * 
		 * 
		 * 
		 * System.out.print("Employee ID :"+e.getEid( ));
		 * 
		 * System.out.print("               Employee name :"+e.getEname( ));
		 * 
		 * System.out.println("\t            Employee Deg :"+e.getDeg());
		 */

		/* Ordering */

		// Between
		
		  Query query = entitymanager.createQuery( "Select e " + "from Employee e " +
		  "ORDER BY e.ename ASC" );
		  
		  List<Employee> list = (List<Employee>)query.getResultList( );
		  
		  for( Employee e:list ) { System.out.print("Employee ID :" + e.getEid( ));
		  System.out.println("\t Employee Name :" + e.getEname( ));
		 

		
	}
}}