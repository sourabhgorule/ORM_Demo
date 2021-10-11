package com.ormDemo.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ormDemo.beans.Address;
import com.ormDemo.beans.Employee;



public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp=new Employee();
		emp.setId(90);
		emp.setName("vishal");
		
		List<String> Hobbies=new ArrayList<String>();
		Hobbies.add("swimming");
		Hobbies.add("writing");
		
		emp.setHobbies(Hobbies);
		
		Address add=new Address("pune", "416220");
		
		emp.setAddress(add);
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		
		Session session=factory.openSession();
		session.beginTransaction();
		
		session.save(emp);
		
		session.getTransaction().commit();
		session.close();
		
		
	}

}
