package com.bookapp.model.service;

import java.util.List;

import com.bookapp.model.dao.Book;
import com.bookapp.model.dao.BookDao;
import com.bookapp.model.dao.BookDaoImpl;

public class BookServiceImpl implements BookService{

	private BookDao bookDao;
	
	public BookServiceImpl() {
		bookDao=new BookDaoImpl();//this is not perfact solution , spring
	}

	@Override
	public List<Book> getAll() {
		return bookDao.getAll();
	}

	@Override
	public void addBook(Book book) {
		//some extra logic
		bookDao.addBook(book);
	}

}
