package com.bookapp.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bookapp.model.entities.Book;

@RestController
@RequestMapping(path = "api")
public class BookRestController {
	
	
	@GetMapping(path = "books2")
	public Book getBookUsingRequestParam(@RequestParam(name = "title")String title, 
			@RequestParam(name="price")double price) {
		return new Book(123, title,price);
	}
	
	@GetMapping(path = "books/{id}")
	public Book getBook(@PathVariable(name = "id") int id) {
		return new Book(id, "java basics", 670.00);
	}

}
