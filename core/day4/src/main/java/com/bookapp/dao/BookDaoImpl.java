package com.bookapp.dao;
import java.util.Arrays;
import java.util.List;

// @Mock vs @Spy

public class BookDaoImpl implements BookDao {
	@Override
	public List<String> getBooks() {
		System.out.println("i am called");
		return Arrays.asList("java adv","java basics","rich dad poor dad");
	}

//	public void log() {
//		System.out.println("logging in action...");
//	}
}