package com.session3.file_downler;

public class FileDownloaderTask implements Runnable {

	private String url;

	public FileDownloaderTask(String url) {
		this.url = url;
	}
	@Override
	public void run() {
		DownloadManager.download(url);
	}

}
