package com.bookappclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class BookappClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookappClientApplication.class, args);
	}

	//resttemplate is impl of template dp....that simplify the interation bw 2 microservice
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
