package com.day3.topic2.ex_handling_io;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_DemoExHandlingARM {

	public static void main(String[] args) {

		// Java 7: Automatic resouce mgt ARM? new syn: try with resource
		String line = null;

		// unchecked ex: logical problem
		// divide by zero
		// Scanner scanner = null;
//		//try with resouce : paranthesis
//		try(){
//			
//		}

		try (Scanner scanner = new Scanner(System.in)) {
			int x, y, z;

			System.out.println("PE 2 numbers");
			x = scanner.nextInt();
			y = scanner.nextInt();
			z = x / y;

			System.out.println(z);

		} catch (InputMismatchException ex) {
			System.out.println("input mismatch ex");
		} catch (ArithmeticException ex) {
			System.out.println("ArithmeticException ex");
		} finally {

		}

	}
}
