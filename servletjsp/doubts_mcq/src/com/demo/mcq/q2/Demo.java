package com.demo.mcq.q2;

public class Demo {
	public static void main(String[] args) {

		System.out.println(returnSomething());

	}

	private static int returnSomething() {
		try {
			return 6;
		} finally {
			return 9;
		}
	}
}