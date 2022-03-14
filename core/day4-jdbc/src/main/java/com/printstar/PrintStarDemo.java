package com.printstar;

import java.util.Scanner;

/*
 * u can only have one public class in a java file
 * u can have any no of non public class inside a java file
 * 
 * then name of prog must be same a name of public class otherwise it will not compile
 */
public class PrintStarDemo{

	public static void main(String[] args) {
		/*
		 *  
     *
    ***
   *****
 ********
**********
	AP
		 */
		printStars();
		
	}

	static void printStars() {
		System.out.println("PE no of star row...");
		Scanner scanner=new Scanner(System.in);
		int n= scanner.nextInt();
		
		for(int i=0;i< n; i++) {
			for(int j=(n-1); j>i; j--) 
				System.out.print(" ");
			
			for(int k=0; k<(2*i+1); k++) 
				System.out.print("*");
			
			System.out.println();
		}
	}
}
