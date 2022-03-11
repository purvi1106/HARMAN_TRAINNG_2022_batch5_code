package com.day3.topic2.ex_handling_io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ByteVsCharStream {

	public static void main(String[] args) {

//		//char vs byte stream 
		// FileInputStream vs FileOutputStream

		long start = System.currentTimeMillis();

		try {
									// c:\\raj\\vid\\bar.mp4: window sytem
			
//			FileReader fr = new FileReader("/home/raj/Desktop/vid/bar.mp4");
//			FileWriter fw = new FileWriter("/home/raj/Desktop/vid/bar2.mp4");
			FileInputStream fr = new FileInputStream("/home/raj/Desktop/vid/bar.mp4");
			FileOutputStream fw = new FileOutputStream("/home/raj/Desktop/vid/bar2.mp4");
			
			int i = 0;
			while ((i = fr.read()) != -1) {
				fw.write(i);
			}
			fw.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
//		
		System.out.println("file is written");

		long end = System.currentTimeMillis();

		System.out.println("time taken : " + (end - start) + " ms");

	}
}
