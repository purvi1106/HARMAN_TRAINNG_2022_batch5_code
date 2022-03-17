package com.session2.basic_threads;

class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println("i am the job that is started by thead: " + Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}
		System.out.println("i am the job that is end by thead: " + Thread.currentThread().getName());
	}

}

public class HWThread3 {

	public static void main(String[] args) {
		System.out.println("main is started");

		
		MyThread thread = new MyThread();
		thread.setName("A");
		Thread thread2 = new MyThread();
		thread2.setName("B");
		Thread thread3 = new MyThread();
		thread3.setName("C");
		

		thread.start();
		//thread.start();
		thread2.start();
		thread3.start();
		

		// blocking code
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			
		}

		System.out.println("main is end");
	}
}
