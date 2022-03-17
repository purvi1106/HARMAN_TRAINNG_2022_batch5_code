package com.session1.threads_filedownlader_threads;
import java.util.*;
public class FIleDownladerMain {

	public static void main(String[] args) {
		List<String> photoUrls= FileUtil.readFile("download.txt");
		for(String url: photoUrls) {
			FileDownloadTask task=new FileDownloadTask(url);
			Thread thread=new Thread(task);
			thread.start();
			
		}
	}

}
