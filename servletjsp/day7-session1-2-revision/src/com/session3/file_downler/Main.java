package com.session3.file_downler;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		List<String> list=FileUtil.readFiles("photos.txt");
		
		for(String url: list) {
			FileDownloaderTask taks=new FileDownloaderTask(url);
			Thread thread=new Thread(taks);
			thread.start();
		}
	}

}
