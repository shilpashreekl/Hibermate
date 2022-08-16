package com.cg.onetomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager manager=factory.createEntityManager();
		manager.getTransaction().begin();
		
		
		Department department = new Department();
		department.setId(101);
		department.setName("c2tc");
		
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("shilpa");
		employee.setSalary(5000);
		
		department.addEmployee(employee);
		manager.persist(department);
		
		manager.getTransaction().commit();
		System.out.println("added employee and manager ");
		
		manager.close();
		factory.close();

	}

}
