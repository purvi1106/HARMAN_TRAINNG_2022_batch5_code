package a;

import java.util.Scanner;

public class D_PrimeNoV2 {

	public static void main(String[] args) {
		System.out.println("-----Prime number in a range----");
		Scanner scanner=new Scanner(System.in);
		
		int counter=0;
		System.out.println("PE Enter a number from from where u want to start...");
		int n1=scanner.nextInt();
		
		System.out.println("PE Enter a number  where u want to end...");
		int n2=scanner.nextInt();
		
		for(int i=n1; i<=n2; i++) {
			if(checkForPrimeNumber(i)){
				counter++;
			}
		}
	
		System.out.println("Prime no bw those 2 numbers: "+ counter);
		
		
	}

	
	
	static boolean checkForPrimeNumber(int n) {
		boolean isPrime= true;
		
		for(int i=2; i<=(n-1); i++) {
			
			if(n%i==0) {
				isPrime=false;
				break;
			}
		}
		return isPrime;
	}
}
