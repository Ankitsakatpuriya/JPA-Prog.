package com.aartek;
import java.util.List;
import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Main {
   public static void main(String[] args) {
   
   EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "jp" );
   EntityManager entitymanager = emfactory.createEntityManager( );
   entitymanager.getTransaction( ).begin( );

   //Create Employee1 Entity
   Employee employee1 = new Employee();
   employee1.setEname("SaYam");
   employee1.setSalary(45000.0);
   employee1.setDeg("Technical Writer");

   //Create Employee2 Entity
   Employee employee2 = new Employee();
   employee2.setEname("Krishna");
   employee2.setSalary(45000.0);
   employee2.setDeg("Technical java");

   //Create Employee3 Entity
   Employee employee3 = new Employee();
   employee3.setEname("Ram");
   employee3.setSalary(50000.0);
   employee3.setDeg("Technical Anguler");

   //Store Employee
   entitymanager.persist(employee1);
   entitymanager.persist(employee2);
   entitymanager.persist(employee3);

   //Create Employeelist
   List<Employee> emplist = new ArrayList();
   emplist.add(employee1);
   emplist.add(employee2);
   emplist.add(employee3);

   //Create Department Entity
   Department department = new Department();
   department.setName("Development");
   department.setEmployeelist(emplist);

   //Store Department
   entitymanager.persist(department);

   entitymanager.getTransaction().commit();
   entitymanager.close();
   emfactory.close();
   }
}