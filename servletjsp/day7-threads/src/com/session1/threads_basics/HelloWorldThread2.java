package com.session1.threads_basics;

//2 ways: extends Thread vs Runnable
class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println("i am starting some job: "+ Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {}
		System.out.println("i am ending some job: "+ Thread.currentThread().getName());
	}
	
	
}
public class HelloWorldThread2 {
	
	public static void main(String[] args) {
		System.out.println("main start");
		MyThread myThread=new MyThread();
		myThread.setName("A");
		
		myThread.start();
			
		System.out.println("main end");
	}

}
