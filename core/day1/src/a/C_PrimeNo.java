package a;

import java.util.Scanner;

public class C_PrimeNo {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("PE a no to check for prime no...");
		int n=scanner.nextInt();
		
		// N1 and N2 12 to 122
		
		boolean isPrime= true;
		
		for(int i=2; i<=(n-1); i++) {
			
			if(n%i==0) {
				isPrime=false;
				break;
			}
		}
		
		if(isPrime) {
			System.out.println("it is a prime no");
		}else
			System.out.println("it is not a prime no");
	}
}
