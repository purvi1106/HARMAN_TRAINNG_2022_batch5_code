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

public class DirtyStateChecking {

	public static void main(String[] args) {
		// u need to create Somethng called SessionFactory

		SessionFactory factory = HibernateConnectionFactory.getSessionFactory();

		Session session = factory.openSession();

		Transaction tx = session.getTransaction();

		Employee employee = session.get(Employee.class, 1);
		employee.setSalary(70000);

		try {
			tx.begin();
			employee.setSalary(85000);
			employee.setSalary(100000);

			tx.commit();
		} catch (HibernateException ex) {
			ex.printStackTrace();
			tx.rollback();
		}

		session.close();
		// the employee object become detached ...
		factory.close();

	}
}
