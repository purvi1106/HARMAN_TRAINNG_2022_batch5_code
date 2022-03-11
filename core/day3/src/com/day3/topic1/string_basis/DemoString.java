package com.day3.topic1.string_basis;

public class DemoString {

	public static void main(String[] args) {
		
		String a="india";//string are stored in something called String pool
		String b=new String("india");
		
		//what is bad PP on string
		
		String data="a"+"b"+"c"+"d";
		System.out.println(data);
		
		//gpp: good prog practice 
		String data1=new StringBuilder().append("a").append("b").append("c").append("d").toString();
		
		System.out.println(data1);
		
		
		//they are "immutable"
		
//		a=a.toUpperCase();
//		System.out.println(a);
		
		
//		if(a.equals(b))
//			System.out.println("yes");
//		else
//			System.out.println("no");
		
//		if(a==b)
//			System.out.println("yes");
//		else
//			System.out.println("no");
		
	}
}
