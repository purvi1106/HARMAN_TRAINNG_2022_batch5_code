package com.revision;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.factory.HibernateSessionFactory;

public class CurdOp {
	
	
	public static void main(String[] args) {
		SessionFactory factory=HibernateSessionFactory.getSessionFactory();
		Session sesssion= factory.openSession();
		
		Employee employee=new Employee("puneet", "delhi", "sales", 4000, "r@r.com");
		//Student student= new Student("indu", "noida");
		//Foo foo=new Foo("foo", "foo city");
		
		Transaction tx=sesssion.getTransaction();
		try {
			System.out.println("1.------------------");
			tx.begin();
			System.out.println("2.------------------");
			sesssion.save(employee);
			//sesssion.save(student);
			
			//sesssion.save(foo);
			
			System.out.println("3.------------------");
			tx.commit();
			System.out.println("4.------------------");
		}catch(HibernateException ex) {
			System.out.println(ex);
			tx.rollback();
		}
		
		sesssion.close();
		factory.close();
		
		
	}

}
