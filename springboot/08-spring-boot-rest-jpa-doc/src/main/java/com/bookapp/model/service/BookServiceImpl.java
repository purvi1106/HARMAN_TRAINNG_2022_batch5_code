package com.bookapp.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bookapp.model.dao.BookDao;
import com.bookapp.model.entities.Book;
import com.bookapp.model.exceptions.BookNotFoundException;

@Service
@Transactional
public class BookServiceImpl implements BookService {

	private BookDao bookDao;

	@Autowired
	public BookServiceImpl(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	@Override
	public List<Book> getAllBooks() {
		return bookDao.findAll();
	}

	@Override
	public Book getBookById(int id) {
		return bookDao.findById(id)
				.orElseThrow(() -> new BookNotFoundException("book with id " + id + " is not found"));
	}

	@Override
	public Book addBook(Book book) {
		bookDao.save(book);
		return book;
	}

	@Override
	public List<Book> getBookByTitle(String title) {
		return bookDao.findByTitle(title);
	}

	@Override
	public Book updateBook(int bookId, Book book) {
		Book bookToUpdate = getBookById(bookId);

		bookToUpdate.setPrice(book.getPrice());
		bookDao.save(bookToUpdate);

		return bookToUpdate;
	}

	@Override
	public Book deleteBook(int bookId) {
		Book bookToDelete = getBookById(bookId);

		bookDao.delete(bookToDelete);

		return bookToDelete;
	}

}
