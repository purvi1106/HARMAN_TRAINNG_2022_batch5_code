package com.bookapp;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class Application implements CommandLineRunner{


	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	}

}
