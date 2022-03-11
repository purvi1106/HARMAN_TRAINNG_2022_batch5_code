package com.day3.topic2.ex_handling_io;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_DemoExHandlingMulitiCatch {

	public static void main(String[] args) {


		try (Scanner scanner = new Scanner(System.in)) {
			int x, y, z;

			System.out.println("PE 2 numbers");
			x = scanner.nextInt();
			y = scanner.nextInt();
			z = x / y;

			System.out.println(z);

		} catch (InputMismatchException | ArithmeticException ex) {
			System.out.println(ex);
		} 

	}
}
