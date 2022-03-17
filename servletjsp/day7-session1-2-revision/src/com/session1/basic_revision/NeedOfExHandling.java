package com.session1.basic_revision;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NeedOfExHandling {

	public static void main(String[] args) {

		// hey God give me problem ... but give me strenth to fight with them: exception
		// handling
		// try, catch , throw, throws, finally

		Scanner scanner = null;

		try {
			scanner = new Scanner(System.in);
			System.out.println("PE 2 nos");
			int x = scanner.nextInt();
			int y = scanner.nextInt();

			int z = x / y;

			System.out.println("value of Result is: " + z);

		} catch (ArithmeticException ex) {
			System.out.println("dont divide by zero");

		} catch (InputMismatchException ex) {
			System.out.println("pls enter int only");

		} finally {
			System.out.println("it is finally block");
			scanner.close();
		}

		System.out.println("finished");
	}
}
