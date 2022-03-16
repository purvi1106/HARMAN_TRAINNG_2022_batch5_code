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

public class Delete {

	public static void main(String[] args) {

		
		SessionFactory factory = HibernateSessionFactory.getSessionFactory();

		Session session = factory.openSession();
		
		Transaction tx=session.getTransaction();
		try {
			
			tx.begin();
			
			Employee employee=session.load(Employee.class, 1);
			System.out.println("-----------------");
			if(employee!=null)
			session.delete(employee);
			
			tx.commit();
			
		}catch(HibernateException ex) {
			
			tx.rollback();
		}
		

		
		session.close();
///
		factory.close();

	}

}
