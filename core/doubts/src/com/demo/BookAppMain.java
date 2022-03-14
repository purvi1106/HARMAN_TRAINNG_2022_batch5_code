package com.demo;

public class BookAppMain {

	public static void main(String[] args) {
		BookApp app=new BookApp();
		app.printBookApp();
		System.out.println("let us find the book");
		Book book=app.searchBook(4102);
		System.out.println(book);
	}
}
