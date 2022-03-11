package com.day3.topic3.collections;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;

public class WordsWithFreq {

	public static void main(String[] args) {
		// wap to read a file and print the freq of each words

		Map<String, Integer> wordsMap = new TreeMap<>();

		try {
			BufferedReader br = new BufferedReader(new FileReader(new File("ali.txt")));
			String line = null;

			while ((line = br.readLine()) != null) {
				String tokens[] = line.split(" ");
				for (String token : tokens) {

					// i alreay found the word in the map
					if (wordsMap.containsKey(token)) {
						Integer freq = wordsMap.get(token);
						wordsMap.put(token, ++freq);
					} else {
						wordsMap.put(token, new Integer(1));
					}

				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("file is not found");
		} catch (IOException ex) {
			System.out.println("some io ex occure..");
		} catch (Exception ex) {
			System.out.println("some ex occure...");
		}
		// just print that map
		Set<Entry<String, Integer>> entrySet = wordsMap.entrySet();

		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}
