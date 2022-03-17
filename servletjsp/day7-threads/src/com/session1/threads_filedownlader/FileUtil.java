package com.session1.threads_filedownlader;

import java.util.*;
import java.io.*;

//it wiil read the file and give me list of file in arraylist
public class FileUtil {
	public static List<String> readFile(String fileName) {
		List<String> list = new ArrayList<String>();

		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			String line = null;

			while ((line = br.readLine()) != null) {
				list.add(line);
			}
		} catch (IOException ex) {
			ex.getSuppressed();
		}
		return list;
	}

}
