package com.demo.mcq;

import java.io.File;
import java.io.FileFilter;

public class DemoInterface {

	public static void main(String[] args) {
		//how to create or read a dir
		//how to print all hidden file/folder from my foler
		
		File dir=new File("/home/raj/Desktop/tools/sts-bundle/sts-3.9.12.RELEASE");
		
		if(dir.isDirectory()) {
			File []files=dir.listFiles(new FileFilter() {
				
				@Override
				public boolean accept(File pathname) {
					return pathname.isHidden();
				}
			});
			for(File file: files) {
				System.out.println(file.getName());
			}
		}
	}
}
