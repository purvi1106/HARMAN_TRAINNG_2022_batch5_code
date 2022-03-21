package com.crud;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

import com.factory.HibernateConnectionFactory;

public class SaveVsPersist {

	public static void main(String[] args) {
		//u need to create Somethng called SessionFactory
	
		SessionFactory factory=HibernateConnectionFactory.getSessionFactory();
	
		Session session=factory.openSession();
		
		
		Transaction tx=session.getTransaction();
		
		Employee employee=new Employee("anita", 46000, 34);	//Transient
		
		
		try {
			tx.begin();
			//Integer empId = (Integer) session.save(employee);	
			session.persist(employee);	
			
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
