package com.aartek;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Main {
   public static void main(String[] args) {
   
   EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "jp" );
   EntityManager entitymanager = emfactory.createEntityManager( );
   entitymanager.getTransaction( ).begin( );

   //Create Department Entity
   Department department = new Department();
   department.setName("IT Person");

   //Store Department
   entitymanager.persist(department);

   //Create Employee Entity
   Employee employee = new Employee();
   employee.setEname("Om");
   employee.setSalary(50000.0);
   employee.setDeg("Technical Anguler Java Dev.");
   employee.setDepartment(department);

   //Store Employee
   entitymanager.persist(employee);

   entitymanager.getTransaction().commit();
   entitymanager.close();
   emfactory.close();
   }
}