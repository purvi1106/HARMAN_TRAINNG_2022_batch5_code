package com.day2.batch5.session2;

class StackRavi implements Stack{
	private int arr[];
	final private int SIZE=5;
	private int top;
	
	public StackRavi() {
		arr=new int[SIZE];
		top=-1;
	}
	public void push(int data) {
		if(top==SIZE-1)
			System.out.println("size is full");
		else
			arr[++top]=data;
	}
	public int pop() {
		if(top==-1) {
			System.out.println("stack is empty");
			return -999;
		}
		else
			
			return arr[top--];
	}
	
}