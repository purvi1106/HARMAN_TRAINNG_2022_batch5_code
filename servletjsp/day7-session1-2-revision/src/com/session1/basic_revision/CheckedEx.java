package com.session1.basic_revision;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedEx {

	public static void main(String[] args) {
		try {
			BufferedReader br=new BufferedReader(new FileReader("foo.txt"));
			System.out.println("file is found");
		} catch (FileNotFoundException e) {
			System.out.println("file is not found pl check the path...");
		}
	}
}
