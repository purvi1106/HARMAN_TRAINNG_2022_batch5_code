package com.bookapp.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.bookapp.dao.BookDao;

class BookServiceImplTest {

	private BookDao dao;
	private BookServiceImpl bookService;
	
	@BeforeEach
	void setUp() throws Exception {
		//construct --- set behiviour --verify
		//dao=new BookDaoImpl();
		dao=mock(BookDao.class);
		
		List<String> books=Arrays.asList("java","rich dad poor dad","java adv");
		
		when(dao.getBooks()).thenReturn(books);
		
		bookService=new BookServiceImpl();
		bookService.setBookDao(dao);
	}
	
	@Test
	void getBooksAllJavaBookCountIsTwo() {
		//System.out.println("hello");
		assertEquals(2, bookService.getBooks("java").size());
	}

	@AfterEach
	void tearDown() throws Exception {
		dao=null;
		bookService=null;
	}

	

}
