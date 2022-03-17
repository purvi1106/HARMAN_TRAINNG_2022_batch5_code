package com.session2.basic_threads;

public class HWThread4 {

	public static void main(String[] args) {
//		Runnable runnable=new Runnable() {
//			
//			@Override
//			public void run() {
//				System.out.println("this is the job done by the thread....");
//			}
//		};

		Runnable runnable = ()-> {
				System.out.println("this is the job done by the thread....");
			
		};

		Thread thread = new Thread(runnable);
		thread.start();
	}
}
