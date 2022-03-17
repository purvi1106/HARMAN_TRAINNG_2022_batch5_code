package com.session1.threads_basics;

public class HelloWorldThread3 {

	public static void main(String[] args) {

//		Runnable runnable=new Runnable() {
//			
//			@Override
//			public void run() {
//				System.out.println("some job of the threads....");
//			}
//		};
//		
//		Thread thread=new Thread(runnable);
//		thread.start();

		Runnable runnable = ()-> System.out.println("some job of the threads....");
			
		Thread thread = new Thread(runnable);
		thread.start();

	}

}
