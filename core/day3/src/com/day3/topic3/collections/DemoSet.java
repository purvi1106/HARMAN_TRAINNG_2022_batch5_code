package com.day3.topic3.collections;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class DemoSet {

	public static void main(String[] args) {
		// wap to read a file and print the uniqe words

		Set<String> words = new TreeSet<String>();
		// ----1. read the file

		// -----2. store them in the set
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File("ali.txt")));
			String line = null;

			while ((line = br.readLine()) != null) {
				String tokens[] = line.split(" ");
				for (String token : tokens) {
					words.add(token.toLowerCase());
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("file is not found");
		} catch (IOException ex) {
			System.out.println("some io ex occure..");
		} catch (Exception ex) {
			System.out.println("some ex occure...");
		}
		// -------3. print them-------
		for(String word: words)
			System.out.println(word);
	}
}
