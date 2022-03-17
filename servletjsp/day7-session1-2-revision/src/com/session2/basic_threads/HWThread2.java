package com.session2.basic_threads;

class MyJob implements Runnable {

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

public class HWThread2 {

	public static void main(String[] args) {
		System.out.println("main is started");

		MyJob job = new MyJob();
		Thread thread = new Thread(job, "A");
		Thread thread2 = new Thread(job, "B");
		Thread thread3 = new Thread(job, "C");
		

		thread.start();
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
