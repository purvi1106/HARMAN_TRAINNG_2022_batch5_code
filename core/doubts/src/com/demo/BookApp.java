package com.demo;

import java.util.*;
import java.io.*;

public class BookApp {

	private String bookAppName = "harman lib";
	private List<Book> books = new LinkedList<Book>();

	public BookApp() {
		init();

	}

	public Book searchBook(int id) {
		boolean isFound = false;
		for (Book book : books) {
			if (book.getId() == id) {
				isFound = true;
				return book;
			}
		}
		if (!isFound)
			throw new BookNotFoundExcption();
		return null;

	}

	public void sellBook(String isbn, int noOfCopies) {

	}

	public void purchageBook(String isbn, int noOfCopies) {

	}

	void init() {
		// i will read that file and populate the collection
		// filereader vs fileinputStream
		Book tempBook = null;
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File("books.txt")));
			String line = null;
			while ((line = br.readLine()) != null) {
				String tokens[] = line.split(":");
				tempBook = new Book(Integer.parseInt(tokens[0]), tokens[1], tokens[2], tokens[3],
						Double.parseDouble(tokens[4]));
				books.add(tempBook);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void printBookApp() {
		System.out.println("----------bookAppName------------");
		for (Book book : books) {
			System.out.println(book);
		}
	}
}
