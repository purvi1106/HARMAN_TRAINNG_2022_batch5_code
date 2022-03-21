package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
			//if u are using xml or annotion then u can go with ApplicationContext
		AnnotationConfigApplicationContext ctx=
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		//But if u want to go with java config
		//then we need to use something else:AnnotationConfigApplicationContext
		
		Passanger passanger=ctx.getBean("passanger", Passanger.class);
		System.out.println(passanger.hashCode());
		passanger.travel();
		
		Passanger passanger2=ctx.getBean("passanger", Passanger.class);
		System.out.println(passanger2.hashCode());

	}

}
