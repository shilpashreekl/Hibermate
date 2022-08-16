package com.cg.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {
	public static void main(String[] args) {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
	EntityManager manager=factory.createEntityManager();
	manager.getTransaction().begin();
	
	
	Student student =new Student();
	student.setName("Lekha");
	Address address = new Address();
	address.setStreet("xyz");
	address.setState("Karnataka");
	address.setCity("srt");
	address.setZip("560098");
	student.setAddress(address);
	manager.persist(student);
	manager.getTransaction().commit();
	System.out.println("added one student details");
	manager.close();
	factory.close();
	
	
	
}
}
