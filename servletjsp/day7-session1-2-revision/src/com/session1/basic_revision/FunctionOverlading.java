package com.session1.basic_revision;
//constructor can overload
//class B{
//	B(){
//		System.out.println("default ctr");
//	}
//	B(int i){
//		System.out.println("parametized ctr");
//	}
//}
//funcation overloading can happen in same class or in drived class
//class A{
//	public int add(int a, int b) {
//		return a+b;
//	}
//}
//
//class B extends A{
//	public int add(int a, int b, int c) {
//		return a+b+c;
//	}
//}


class A{
	public void foo() {
		System.out.println("foo of base class");
	}
	
}

class B extends A{
	public void foo() {
		System.out.println("foo of base class overriding");
	}
	public void fooExMethodOfB() {
		System.out.println("i am a special method of class B");
	}
}


public class FunctionOverlading {
	
	public static void main(String[] args) {
		
//		B a =new A();
//		a.foo();
//		a.fooExMethodOfB();
		
		
		//pointer of base class= object of drived class
//		A a					=				new B();
//		a.foo();
	}

}


