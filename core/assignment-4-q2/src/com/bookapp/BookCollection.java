package com.bookapp;
import java.util.*;
public class BookCollection {
	private String ownerName;
	private List<Book> books;
	
	public BookCollection(String ownerName) {
		this.ownerName = ownerName;
		this.books=new ArrayList<Book>();
		init();
	}
	private void init() {
		books.add(new Book(1, "java in action", "foo"));
		books.add(new Book(109, "power of mind", "bar"));
		books.add(new Book(19, "Java in depth", "jar"));
	}
	
	public boolean hasBook(Book b) {
		//search opeation
		return true;
	}
	
	public void sort() {
		//sort it
	}
	
}
