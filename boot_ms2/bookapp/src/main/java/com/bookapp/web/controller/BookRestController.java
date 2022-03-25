package com.bookapp.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookapp.model.entities.Book;
import com.bookapp.model.service.BookService;

@RestController
@RequestMapping(path = "api")
public class BookRestController {

	private BookService bookService;

	@Autowired
	public BookRestController(BookService bookService) {
		this.bookService = bookService;
	}
	// ---------getting all the books---

	@GetMapping(path = "books")
	public List<Book> getAllBooks() {
		return bookService.getAllBooks();
	}

	// ---------getting an specific book----
	@GetMapping(path = "books/{id}")
	public Book getAnBook(@PathVariable(name = "id") int id) {
		return bookService.getBookById(id);
	}

	// ---------adding an new book----
	// from user , user will send json data==> i need to convert that to java object
	// ie done with the help of an annotation whose name is @RequestBody
	@PostMapping(path = "books")
	public Book addBook(@RequestBody Book book) {
		return bookService.addBook(book);
	}

	// ---------delete an book----
	@DeleteMapping(path = "books/{id}")
	public Book deleteBook(@PathVariable(name = "id") int id) {
		return bookService.deleteBook(id);
	}
	
	
	// ---------update an book----
	@PutMapping(path = "books/{id}")
	public Book udpateBook(@PathVariable int id, @RequestBody Book book) {
		return bookService.updateBook(id, book);
	}
	
}
