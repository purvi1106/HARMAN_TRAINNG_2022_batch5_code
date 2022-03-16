package com.demo.mcq;

import java.util.*;

class MyClass implements Comparable<MyClass> {
	private int id;

	public MyClass(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "MyClass [id=" + id + "]";
	}

	@Override
	public int compareTo(MyClass o) {
		return Integer.compare(this.getId(), o.getId());
	}
}
interface Foo{
	void foo();
}
interface Foo2 extends Foo{
	
}
public class DemoMain {
	public static void main(String[] args) {
		TreeSet<MyClass> treeSet = new TreeSet<MyClass>();
		treeSet.add(new MyClass(22));
		treeSet.add(new MyClass(2));

		System.out.println(treeSet);

	}
}
