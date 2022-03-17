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

public class UpdateEmp {

	public static void main(String[] args) {
		//u need to create Somethng called SessionFactory
	
		SessionFactory factory=HibernateConnectionFactory.getSessionFactory();
	
		//2. from sessionfactory --> session
		Session session=factory.openSession();
		
		//3. need to start the transaction
		Transaction tx=session.getTransaction();
		
		//find the emp that u want to update
		
		Employee empToUpdate= session.get(Employee.class, 3);
		empToUpdate.setSalary(empToUpdate.getSalary()+1000);
		
		try {
			tx.begin();
			session.update(empToUpdate);		//call session.save(emp)
			tx.commit();
		}catch(HibernateException ex) {
			ex.printStackTrace();
			tx.rollback();
		}

		//close the session
		session.close();
		
		//close the sf
		factory.close();
		
	}
}
