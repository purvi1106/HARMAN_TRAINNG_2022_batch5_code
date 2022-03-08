package a;

import java.util.Scanner;

public class NextDateProblem {

	public static void main(String[] args) {
		
		//1. no error handling
		//2. no oo way
		//3. no moduarity
		
		
		/*
		 * 31/12/2022 4. day: 31 month :12 year: 2022
		 */
		/* 1st part
		 * take the input from the user day month year part valiation* also print it
		 */
		Scanner scanner=new Scanner(System.in);
		int year, month , day;
		System.out.println("PE day");
		day = scanner.nextInt();
		System.out.println("PE month");
		month = scanner.nextInt();
		System.out.println("PE year");
		year = scanner.nextInt();
		
		System.out.println("you have entered date : "+ day +"/"+ month+"/"+ year);
		
		//2nd part of the problem : leap year logic
		
		//3 part of the problem : to declare a array to hold days in the months
		
		//-1 means invalid month , as in real life month start from one not zero
		int noOfDays[]={-1, 31,28/29,31,30,31,30,31,31,30,31,30,31};
		
		if(isLeapYear(year)) {
			noOfDays[2]=29;	// as that was leap year , we have no of days =29
		}
		
		
		//4. actual logic to calculate next date
		
		day=day + 1;
		
		if(day>noOfDays[month]){
			day=1;
			month ++; //13
			 
			if(month >12){
				month =1;
				year++;
			}
		  }
		
		
		//5 part : printing the next date
		System.out.println("Next date : "+ day +"/"+ month+"/"+ year);
		
	}
	
	public static boolean isLeapYear(int year) {
		if( (year%400==0 || year%100!=0) &&(year%4==0))
			return true;
		else
			return false;
	}
}




