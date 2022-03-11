package com.day3.topic1.string_basis;

public class DemoString2 {

	public static void main(String[] args) {

		String line = "Hard work beats talent every single time It does not matter what your capabilities are, what matters is how you perform."
				+ " What could have been being nothing";

		String tokens[]=line.split(" ");
		for(String token: tokens) {
			System.out.println(token.toLowerCase());
		}
		
		// some common fun
//		String a=" inDia ";
//		System.out.println(a.toUpperCase());
//		System.out.println(a.toLowerCase());
//		
//		System.out.println(a.trim());

	}

}
