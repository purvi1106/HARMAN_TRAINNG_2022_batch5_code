package com.day3.topic2.ex_handling_io;
//u are creating ur own ex: ie called used define ex

// extends RuntimeException : if u want to create un checked ex
//extends Exception :  if u want to create checked ex
//1. we havve craete user define ex
public class InvalideSalaryException  extends RuntimeException /* extends Exception */{
	public InvalideSalaryException(String message) {
		super(message);
	}
}
