package com.bookapp.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookapp.model.dao.Book;
import com.bookapp.model.dao.BookDao;

@Service(value = "bookService")
public class BookServiceImpl implements BookService{
	private BookDao bookDao;
	
	@Autowired
	public BookServiceImpl(BookDao bookDao) {
		this.bookDao = bookDao;
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
