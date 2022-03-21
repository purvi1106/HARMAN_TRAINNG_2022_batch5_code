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

public class GetVsLoad {

	public static void main(String[] args) {
		
		SessionFactory factory=HibernateConnectionFactory.getSessionFactory();
	
		Session session=factory.openSession();
		
		Transaction tx=session.getTransaction();
		//Join :spring framework
		//load vs get
		//lazy vs eager featching strategies
		Employee employee=session.get(Employee.class,1);//load method : give the proxy object
		
		System.out.println("---------------");
		session.close();
		System.out.println(employee);
		
		
		factory.close();
		
	}
}
