package com.bookapp.web.controller;
import java.util.*;

import com.bookapp.model.dao.Book;
import com.bookapp.model.service.BookService;
import com.bookapp.model.service.BookServiceImpl;

public class Main {

	public static void main(String[] args) {
		BookService bookService=new BookServiceImpl();
		
		Book book=new Book("rich dad poor dad", 200);
		bookService.addBook(book);
		
//		List<Book> books=bookService.getAll();
//		for(Book book: books) {
//			System.out.println(book);
//		}
	}
}
