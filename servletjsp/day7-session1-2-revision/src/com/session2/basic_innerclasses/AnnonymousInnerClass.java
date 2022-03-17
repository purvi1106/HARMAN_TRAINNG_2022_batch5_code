package com.session2.basic_innerclasses;
interface Cookable{
	void cook();
}
public class AnnonymousInnerClass {
	public static void main(String[] args) {
		
		Cookable cookable=new Cookable() {
			@Override
			public void cook() {
				System.out.println("street food...");
			}
		};
		Cookable cookable2=new Cookable() {
			@Override
			public void cook() {
				System.out.println("hotel food...");
			}
		};
		
		//java 8: lambda expression
		Cookable cookable3=() ->System.out.println("rest food...");
		
		
		cookable.cook();
	}
}
