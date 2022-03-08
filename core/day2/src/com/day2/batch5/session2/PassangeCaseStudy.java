package com.day2.batch5.session2;
//A passanger is using metro to travel from BTM to Marathali
// :)==> manager stop , Bus

import java.util.Scanner;

// interface vs abstract class=> can act in polymorphic way?

//abstract class Vehical{
//	abstract public void move(String s, String d);
//}

 interface Vehical{
	abstract public void move(String s, String d);
}


class  Metro implements Vehical{
	public void move(String s, String d) {
		System.out.println("moving using metro from "+s+ " to "+ d);
	}
}
class  Bus implements Vehical{
	public void move(String s, String d) {
		System.out.println("moving using bus from "+s+ " to "+ d);
	}
}

class  Bike implements Vehical{
	public void move(String s, String d) {
		System.out.println("moving using bike from "+s+ " to "+ d);
	}
}

class Passanger {
	private String name;
	
	public Passanger(String name) {
		this.name=name;
	}
	public void travel(String s, String d,Vehical vehical) {
		System.out.println("name of passanger:"+ name);
		vehical.move(s, d);
	}
}
public class PassangeCaseStudy {
	
	public static void main(String[] args) {
		
		Vehical vehical=null;
		
		System.out.println("Choose ur vehical 1. metro  2.Bus 3.Bike ");
		Scanner scanner=new Scanner(System.in);
		int choice= scanner.nextInt();
		if(choice==1)
			vehical= new Metro();
		else if (choice==2)
			vehical=new Bus();
		else if(choice==3)
			vehical=new Bike();
				
		Passanger passanger=new Passanger("ramesh");
		if(vehical!=null) {
		passanger.travel("BTM", "marathali", vehical);
		}else
			System.out.println("choose correct vehical");
	
		
	}

}
