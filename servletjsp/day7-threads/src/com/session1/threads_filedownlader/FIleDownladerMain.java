package com.session1.threads_filedownlader;
import java.util.*;
public class FIleDownladerMain {

	public static void main(String[] args) {
		List<String> photoUrls= FileUtil.readFile("download.txt");
		for(String url: photoUrls) {
			FileDownloadMgr.download(url);
		}
	}

}
