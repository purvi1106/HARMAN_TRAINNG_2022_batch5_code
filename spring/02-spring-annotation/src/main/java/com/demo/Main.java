package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx=
				new ClassPathXmlApplicationContext("beans.xml");
		
		Passanger passanger=ctx.getBean("passanger", Passanger.class);
		System.out.println(passanger.hashCode());
		passanger.travel();
		
		Passanger passanger2=ctx.getBean("passanger", Passanger.class);
		System.out.println(passanger2.hashCode());

	}

}
