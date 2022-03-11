package com.day3.topic2.ex_handling_io;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_DemoExHandling {

	public static void main(String[] args) {

		String line = null;

		// unchecked ex: logical problem
		// divide by zero
		Scanner scanner = null;
		try {
			int x, y, z;
			scanner = new Scanner(System.in);
			System.out.println("PE 2 numbers");
			x = scanner.nextInt();
			y = scanner.nextInt();
			z = x / y;
			System.out.println(z);

			System.out.println(line.toUpperCase());// NPEx

		} catch (InputMismatchException ex) {
			System.out.println("input mismatch ex");
		} catch (ArithmeticException ex) {
			System.out.println("ArithmeticException ex");
		} finally {
			scanner.close();
		}

	}
}
