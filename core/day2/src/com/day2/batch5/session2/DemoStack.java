package com.day2.batch5.session2;

public class DemoStack {

	public static void main(String[] args) {
		
		Stack stack=new StackRavi();
		
		stack.push(2);
		stack.push(67);
		
		stack.push(92);
		stack.push(201);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
	}
}
