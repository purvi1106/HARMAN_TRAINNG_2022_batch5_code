package com.bookapp.web.controller;

import java.util.*;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookapp.model.dao.Book;
import com.bookapp.model.service.BookService;
import com.bookapp.model.service.BookServiceImpl;

@WebServlet("/bookController")
public class BookController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private BookService bookService;

	// we can say servlet is pulling its depedency , tight coupling
	public BookController() {
		bookService = new BookServiceImpl();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getParameter("action");
		if (action.equals("showall")) {
			// 1. talk to service layer
			List<Book> books = bookService.getAll();

			// 2.get data put into request scope ("servlet have 3 scopes")
			request.setAttribute("books", books);
			// 3. we reqest dispacher to transfer the control to a jsp and then
			RequestDispatcher rd = request.getRequestDispatcher("books.jsp");
			rd.forward(request, response);
			// 4. jsp show the data
		}else if(action.equals("add")) {
			RequestDispatcher rd = request.getRequestDispatcher("add.jsp");
			rd.forward(request, response);
		}

	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String title=request.getParameter("title");
		Double price= Double.parseDouble(request.getParameter("price"));
		
		Book book=new Book(title, price);
		bookService.addBook(book);
		response.sendRedirect("bookController?action=showall");
	}
			
}
