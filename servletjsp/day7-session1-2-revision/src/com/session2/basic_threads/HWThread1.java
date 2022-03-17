package com.session2.basic_threads;

public class HWThread1 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getId());
		
		System.out.println(Thread.currentThread().getThreadGroup());
	}
}
