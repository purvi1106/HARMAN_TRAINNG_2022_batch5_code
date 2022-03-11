package com.day3.topic2.ex_handling_io;
import java.io.*;

public class B_DemoExHandlingIO {

	public static void main(String[] args)/* throws FileNotFoundException */ {
		//File handing in Java?
		try {
			BufferedReader br=new BufferedReader(new FileReader(new File("ali.txt")));
			String line=null;
			
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
		} 
		catch (FileNotFoundException e) {
			System.out.println("file is not found");
		}
		catch(IOException ex) {
			System.out.println("some io ex occure..");
		}
		catch(Exception ex) {
			System.out.println("some ex occure...");
		}
		
		
		
	}
}
