package com.bankapp.web.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bankapp.config.AppConfig;
import com.bankapp.model.service.AccountService;

public class Main {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		AccountService accountService=(AccountService) ctx.getBean("accountService");
		accountService.transfer(1, 2, 100);
	}

}
