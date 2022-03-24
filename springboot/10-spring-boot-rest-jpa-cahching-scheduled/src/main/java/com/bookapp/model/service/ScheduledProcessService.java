package com.bookapp.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledProcessService {

	@Autowired
	private BookService bookService;
	
	@Scheduled(initialDelay = 5000, fixedDelay = 5000)
	public void doJob() {
		bookService.evictCache();
	}
}
