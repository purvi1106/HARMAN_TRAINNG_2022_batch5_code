package com.session2.basic_threads;

public class DemoDeadLock {

	public static void main(String[] args) {
		final Object r1 = "bat";
		final Object r2 = "ball";

		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized (r1) {
					System.out.println("thread1 got lock on r1(bat)");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
					synchronized (r2) {
						System.out.println("thread1 got lock on r2(ball)");
					}
				}
			}
		});
		
		
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized (r1) {
					System.out.println("thread2 got lock on r1(bat)");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
					synchronized (r2) {
						System.out.println("thread2 got lock on r2(ball)");
					}
				}
			}
		});
		
		thread1.start();
		thread2.start();
		
	}
}
