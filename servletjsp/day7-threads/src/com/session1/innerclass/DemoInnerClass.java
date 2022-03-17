package com.session1.innerclass;
//top level inner class
//class A{
//	class B{
//		void foo() {
//			System.out.println("foo method of B class");
//		}
//	}
//}

//method local inner class
//class X{
//	void fooX() {
//		class Y{
//			
//		}
//	}
//}

//Annoymous inner class : Without name
interface Cookable{
	void cook();
}
public class DemoInnerClass {
	
	public static void main(String[] args) {
//		A.B b=new A().new B();
		
		Cookable cookable=new Cookable() {
			@Override
			public void cook() {
				System.out.println("street food");
			}
		};
		
		Cookable cookable2=new Cookable() {
			@Override
			public void cook() {
				System.out.println("hotel food");
			}
		};
		
		//java 8: lambda expression
		Cookable cookable3=() ->System.out.println("street food");

	}

}







