package com.session1.basic_revision;

import java.util.Scanner;

abstract class Shape{
	public abstract void getArea();
}

class Square extends Shape{
	@Override
	public void getArea() {
		System.out.println("area is : L X B");
	}
	
}
class Circle extends Shape{
	@Override
	public void getArea() {
		System.out.println("area is : PI X r X r");
	}
	
}

class Triangle extends Shape{
	@Override
	public void getArea() {
		System.out.println("area is : 0.5 X B X H");
	}
	
}

public class OverridingLoseCouplng {

	public static void main(String[] args) {
		
		Shape shape=null;
		
		Scanner scanner=new Scanner( System.in);
		System.out.println("PE 1. Square 2. Circle 3. Tri");
		int choice =scanner.nextInt();
		if(choice==1) {
			shape=new Square();
		}else if(choice==2) {
			shape=new Circle();
		}else if(choice==3) {
			shape=new Triangle();
		}
		
		try {
			
			
			shape.getArea();
			
			
		}catch(NullPointerException ex) {
			System.out.println("pls enter correct choice");
		}
		
	}
}





