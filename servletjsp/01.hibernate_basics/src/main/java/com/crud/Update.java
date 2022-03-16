package com.crud;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.factory.HibernateSessionFactory;

public class Update {

	public static void main(String[] args) {

		
		SessionFactory factory = HibernateSessionFactory.getSessionFactory();

		Session session = factory.openSession();
		
		Transaction tx=session.getTransaction();
		try {
			
			tx.begin();
			
			Employee employee=session.get(Employee.class, 5);
			employee.setCity("gr noida");
			employee.setCity("banglore 3");
			
			employee.setSalary(87000);
			
			//session.update(employee);
			tx.commit();
			
		}catch(HibernateException ex) {
			
			tx.rollback();
		}
		

		
		session.close();
///
		factory.close();

	}

}
