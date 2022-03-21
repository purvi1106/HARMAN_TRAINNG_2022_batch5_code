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

public class EmpLifeCycle {

	public static void main(String[] args) {
		
		SessionFactory factory=HibernateConnectionFactory.getSessionFactory();
	
		Session session=factory.openSession();
		
		
		Transaction tx=session.getTransaction();
		
		//get operation
		
		Employee employee=session.get(Employee.class,1);//emp object becore persisted
		
		session.evict(employee);
		
		Employee employee2=session.get(Employee.class,1);//emp object becore persisted
		
		
		System.out.println(employee);
		System.out.println(employee2);
		session.close();
		factory.close();
		
	}
}
