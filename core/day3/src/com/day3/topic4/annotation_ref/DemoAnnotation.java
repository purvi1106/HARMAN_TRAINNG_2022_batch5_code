package com.day3.topic4.annotation_ref;
import java.util.*;

class A{
	void foo() {
		System.out.println("foo of class A");
	}
	@Deprecated
	public void oldApi() {
		System.out.println("some old code :(");
	}
	
	
	@SuppressWarnings({"unchecked","rawtypes"})
	public void oldStuff() {
		List list=new ArrayList();
		//,"rawtypes" means hey java compiler i am not using generics dont show me Yellow
		list.add("foo");
	}
}
class B extends A{
	@Override
	void foo() {
		System.out.println("foo of class B overriden");
	}
	public void newApi() {
		System.out.println("some new code :)");
	}
}
public class DemoAnnotation {
	
	public static void main(String[] args) {
	
		A a=new B();
		a.foo();
		a.oldApi();
	}

}
