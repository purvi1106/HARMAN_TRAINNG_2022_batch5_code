package com.bookapp.model.dao;
import java.util.*;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
//@Primary
public class BookDaoImpl implements BookDao{
	
	private static Map<Integer, Book> booksMap = new HashMap<Integer, Book>();
	private static int counter = 0;
	static {
		booksMap.put(++counter, new Book(counter, "Head first Java",  600));
		booksMap.put(++counter,  new Book(counter,"Servlet jsp Java" , 700));
	}

	@Override
	public List<Book> getAll() {
		return new ArrayList<Book>(booksMap.values());
	}

	@Override
	public void addBook(Book book) {
		book.setId(++counter);
		booksMap.put(counter, book);
	}
}
