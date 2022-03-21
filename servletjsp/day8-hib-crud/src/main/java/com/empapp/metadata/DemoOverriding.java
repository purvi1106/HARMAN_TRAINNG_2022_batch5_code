package com.empapp.metadata;
/*
 *  While overriding a method in super class,
 *   if the access specifier is default in super class, what can be the access specifier for the overridden method in subclass	
       A	Default
       B	Public	
       C	Protected	
       D	All of the Above	
 */
//in case of overriding, covarient return type: java 1.4
//in java 1.5

class X{	
}
class Y extends X{
}

class A{
	protected X foof() {
		System.out.println("foof of class A");
		return null;
	}
}
class B extends A{
	//when we are doing overriding , u cant reduce visbility
	protected Y foof() {
		System.out.println("foof of class B");
		return null;
	}
}

public class DemoOverriding {

	public static void main(String[] args) {
		A a=new B();
		a.foof();
	}
}
