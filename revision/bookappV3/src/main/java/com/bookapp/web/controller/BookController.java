package com.bookapp.web.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bookapp.model.dao.Book;
import com.bookapp.model.service.BookService;

@Controller
public class BookController {

	private BookService bookService;
	
	@Autowired
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}

	@GetMapping(path = "showbooks")
	public ModelAndView hello(ModelAndView mv) {
		List<Book>books=bookService.getAll();
		mv.setViewName("show");
		mv.addObject("books", books);
		return mv;
	}
}
