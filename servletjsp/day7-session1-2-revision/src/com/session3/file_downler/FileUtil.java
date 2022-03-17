package com.session3.file_downler;
import java.util.*;
import java.io.*;
public class FileUtil {

	public static List<String> readFiles(String fileName){
		List<String> list=new ArrayList<String>();
		String line=null;
		
		try(BufferedReader br=new BufferedReader(new FileReader("photos.txt"))){
			while((line=br.readLine())!=null) {
				list.add(line);
			}
		}catch(IOException ex) {
			System.out.println("some ex...");
		}
		return list;
	}
}
