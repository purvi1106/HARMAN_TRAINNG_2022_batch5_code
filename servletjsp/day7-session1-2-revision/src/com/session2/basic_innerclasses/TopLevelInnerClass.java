package com.session2.basic_innerclasses;
class A{
	class B{
		void foo() {
			System.out.println("foo of class B");
		}
	}
}
public class TopLevelInnerClass {
	public static void main(String[] args) {
		A.B b=new A().new B();
		b.foo();
	}
}
