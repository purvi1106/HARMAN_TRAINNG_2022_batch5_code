package com.bookapp.web.controller;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookapp.model.dao.Book;
import com.bookapp.model.service.BookService;

@RestController // =@Controller+@ResponseBody(convert ur java object to json)
@RequestMapping(path = "api")
public class BookRestController {

	private BookService bookService;

	@Autowired
	public BookRestController(BookService bookService) {
		this.bookService = bookService;
	}
	
	@GetMapping(path = "books",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Book> getAllBooks(){
		return bookService.getAll();
	}

}
