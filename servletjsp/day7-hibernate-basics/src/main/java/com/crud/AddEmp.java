package com.crud;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

import com.factory.HibernateConnectionFactory;

public class AddEmp {

	public static void main(String[] args) {
		//u need to create Somethng called SessionFactory
	
		SessionFactory factory=HibernateConnectionFactory.getSessionFactory();
	
		Session session=factory.openSession();
		
		
		Transaction tx=session.getTransaction();
		
		Employee employee=new Employee("neeta", 38000, 41);	//Transient
		
		
		try {
			tx.begin();
			session.save(employee);			
			// persisted: after persist hibernate take care about the changes in the object
			tx.commit();
		}catch(HibernateException ex) {
			ex.printStackTrace();
			tx.rollback();
		}

	
		session.close();
		//the employee object become detached ...
		factory.close();
		
	}
}
