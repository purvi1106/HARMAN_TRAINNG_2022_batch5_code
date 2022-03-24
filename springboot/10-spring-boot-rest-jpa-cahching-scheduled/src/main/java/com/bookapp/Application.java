package com.bookapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.bookapp.model.entities.Book;
import com.bookapp.model.service.BookService;
@EnableScheduling
@EnableCaching
@SpringBootApplication
public class Application implements CommandLineRunner{

	
	@Bean
	public CacheManager getCacheManager() {
		ConcurrentMapCacheManager  cacheManager=new ConcurrentMapCacheManager("books");
		return cacheManager;
	}
	
	
	@Autowired
	private BookService bookService;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		bookService.addBook(new Book("effective java", 340.00));
//		bookService.addBook(new Book("rich dad poor dad", 240.00));
//		bookService.addBook(new Book("monk who sold farrari", 300.00));
//		
		
	}

}
