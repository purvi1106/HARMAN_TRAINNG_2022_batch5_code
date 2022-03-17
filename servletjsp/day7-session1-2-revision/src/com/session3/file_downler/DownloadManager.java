package com.session3.file_downler;

public class DownloadManager {

	public static void download(String url) {
		System.out.println(Thread.currentThread().getName() + " is stated downloading " + url);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		System.out.println(Thread.currentThread().getName() + " is done downloading " + url);
	}
}
