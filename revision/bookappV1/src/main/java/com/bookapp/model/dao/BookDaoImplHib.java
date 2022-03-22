package com.bookapp.model.dao;

import java.util.*;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class BookDaoImplHib implements BookDao{

	private SessionFactory factory;
	
	public BookDaoImplHib() {
		factory=HibernateConnectionFactory.getSessionFactory();
	}

	@Override
	public List<Book> getAll() {
		Session session=factory.openSession();
		List<Book>books=session.createQuery("select b from Book b", Book.class).getResultList();
		session.close();
		return books;
	}

	@Override
	public void addBook(Book book) {
		Session session=factory.openSession();
		
		Transaction tx=session.getTransaction();
		try {
			tx.begin();
			session.save(book);
			tx.commit();
		}catch(HibernateException ex) {
			tx.rollback();
			ex.printStackTrace();
		}
		session.close();
	}

}





