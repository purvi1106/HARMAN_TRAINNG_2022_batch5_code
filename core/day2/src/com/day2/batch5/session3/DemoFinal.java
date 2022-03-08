package com.day2.batch5.session3;
//final : final mthod , final class, final data
final class Foo{
	private final int MY_CONSTANT=23;
	//final method ie u can inherit it but can not override it...
	final public void foof() {
		System.out.println("method of Foo class");
		System.out.println(MY_CONSTANT);
	}
}
//class Foo2 extends Foo{
//
////	public void foof() {
////		System.out.println("method of Foo1 class");
////	}
//}

public class DemoFinal {
	
	public static void main(String[] args) {
		//what is run time polymorphism: which method is going to be called is decided at run time
		
//		Foo f=new Foo2();
//		f.foof();
	}
}
