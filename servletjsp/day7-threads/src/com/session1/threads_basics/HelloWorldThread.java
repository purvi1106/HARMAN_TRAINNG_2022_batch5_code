package com.session1.threads_basics;
//2 ways: extends Thread vs Runnable
class MyJob implements Runnable{
	@Override
	public void run() {
		System.out.println("job of the thread..."+Thread.currentThread().getName());
	}
	
}
public class HelloWorldThread {
	
	public static void main(String[] args) {
		
		System.out.println("starting main thread");
		//main thread is blocked for whatever io
		MyJob  job=new MyJob();
		Thread thread=new Thread(job, "A");
		thread.start();
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main is end");
//		System.out.println(Thread.currentThread().getName());
//		System.out.println(Thread.currentThread().getId());
//		System.out.println(Thread.currentThread().getThreadGroup());
//		System.out.println(Thread.currentThread().getPriority());
		
	}

}
