package com.bookappclient.controller;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.bookappclient.dto.Book;

@RestController
public class BookClientRestContoller {
	
	@Autowired
	private RestTemplate restTemplate;
	

	//getForObject		vs 	getForEntiry (ResponseEntity)
	
	
	// delete operation with rest tempate
	@DeleteMapping(path = "books/{id}")
	public String deleteBookToRemoteMicroservice(@PathVariable(name = "id") int id) {
		String url="http://localhost:8082/bookapp/api/books/+id";
		
		restTemplate.delete(url);
		
		System.out.println("this book is deleted successfully..");
		return "book is deleted successfully";
		
	}
	
	
//------- update operation ie adding a new book
	
	@PutMapping(path = "books/{id}")
	public String updateBookToRemoteMicroservice(@PathVariable(name = "id") String id, 
			@RequestBody Book book) {
		String url="http://localhost:8082/bookapp/api/books/{id}";
		
		Map<String, String> params=new HashMap<String, String>();
		params.put("id", id);
		
		
		restTemplate.put(url, book, params);//it is update operation on rest template
		
		System.out.println("this book is aded to the remote app...");
		return "book is updated successfully";
		
	}
	
	
	
	
	
//	@GetMapping(path = "books/{id}")
//	public Book getBook(@PathVariable(name = "id") String id) {
//		String url="http://localhost:8082/bookapp/api/books/{id}";
//		
//		Map<String, String> params=new HashMap<String, String>();
//		params.put("id", id);
//		
//		 ResponseEntity<Book> forEntity = restTemplate.getForEntity(url, Book.class, params);
//		
//		 System.out.println("--------------------------------");
//		 System.out.println(forEntity.getStatusCode());
//		 System.out.println(forEntity.getBody());
//		 System.out.println(forEntity.getHeaders());
//		 
//		 System.out.println("--------------------------------");
//		 return forEntity.getBody();
//	}
//	
	
	
	//------- post operation ie adding a new book
	
//	@PostMapping(path = "books")
//	public Book addNewBookToRemoteMicroservice(@RequestBody Book book) {
//		String url="http://localhost:8082/bookapp/api/books";
//		
//		Book addedBook=restTemplate.postForObject(url, book, Book.class);
//		System.out.println("this book is aded to the remote app...");
//		return addedBook;
//		
//	}
	
	
	
	//-------get all books
	
//	@GetMapping(path = "books")
//	public List<?> getBook() {
//		String url="http://localhost:8082/bookapp/api/books";
//		
//		List<?> list= restTemplate.getForObject(url, List.class);
//		return list;
//	}
	
	
	
//	@GetMapping(path = "books/{id}")
//	public String getBook(@PathVariable(name = "id") String id) {
//		String url="http://localhost:8082/bookapp/api/books/{id}";
//		
//		Map<String, String> params=new HashMap<String, String>();
//		params.put("id", id);
//		
//		String data= restTemplate.getForObject(url, String.class, params);
//		return data;
//	}
	
//	@GetMapping(path = "books/{id}")
//	public Book getBook(@PathVariable(name = "id") String id) {
//		String url="http://localhost:8082/bookapp/api/books/{id}";
//		
//		Map<String, String> params=new HashMap<String, String>();
//		params.put("id", id);
//		
//		Book  book= restTemplate.getForObject(url, Book.class, params);
//		return book;
//	}
	
//	@GetMapping(path = "books/{id}")
//	public Book getBook(@PathVariable(name = "id") int id) {
//		Book  book= restTemplate
//				.getForObject("http://localhost:8082/bookapp/api/books/"+id, Book.class);
//		return book;
//	}

}
