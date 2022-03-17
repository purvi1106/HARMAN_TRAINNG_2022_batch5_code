package com.session1.threads_filedownlader;

public class FileDownloadMgr {

	public static void download(String url) {
		System.out.println(Thread.currentThread().getName() +" is started downloading file "+ url);
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException ex) {}
		
		System.out.println(Thread.currentThread().getName() +" is finish downloading file "+ url);
	}
}
