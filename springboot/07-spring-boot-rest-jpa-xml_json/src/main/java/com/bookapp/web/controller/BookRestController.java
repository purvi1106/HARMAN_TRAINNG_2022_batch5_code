package com.bookapp.web.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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
//HTTP: GET POST PUT DELETE
@RestController
@RequestMapping(path = "api")
public class BookRestController {

	//ResponseEntity<T>= data + proper status code
	
	private BookService bookService;

	@Autowired
	public BookRestController(BookService bookService) {
		this.bookService = bookService;
	}

	// ------get all the books--
	//@GetMapping(path = "books")
	@GetMapping(path = "books", produces =
		{MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<List<Book>> getAllBooks() {
		//int i=6/0;
		return ResponseEntity.status(HttpStatus.OK).body(bookService.getAllBooks());
	}

	// ------get an the book--
	@GetMapping(path = "books/{id}")
	public ResponseEntity<Book> getAnBooks(@PathVariable(name = "id") int id) {
		return ResponseEntity.ok(bookService.getBookById(id));
	}

	// ------delete the book--
	@DeleteMapping(path = "books/{id}")
	public ResponseEntity<Void> deleteAnBooks(@PathVariable(name = "id") int id) {
		bookService.deleteBook(id);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}

	// -----add a new book-
	@PostMapping(path = "books")
	public ResponseEntity<Book> postAnBooks(@Valid  @RequestBody Book book) {
		return ResponseEntity.status(HttpStatus.CREATED).body(bookService.addBook(book));
	}

	// -----update an book-
	@PutMapping(path = "books/{id}")
	public ResponseEntity<Book> updateAnBooks(@PathVariable(name = "id") int id, @RequestBody Book book) {
		return ResponseEntity.status(HttpStatus.OK).body(bookService.updateBook(id, book));
	}
}
