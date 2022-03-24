package com.bookapp.web.controller;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import com.bookapp.model.exceptions.BookNotFoundException;
import com.bookapp.model.exceptions.ErrorDetail;

@RestController
@ControllerAdvice
public class AppExcetpionHandler {

	//proper way to handler 404 error
	@ExceptionHandler(BookNotFoundException.class)
	public ResponseEntity<ErrorDetail> handle404(BookNotFoundException ex, 
			WebRequest request){
		ErrorDetail detail=new ErrorDetail();
		detail.setContect("harman.support@harman.com");
		detail.setDateTime(LocalDateTime.now());
		detail.setMeesage(ex.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(detail);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetail> handle500(Exception ex, 
			WebRequest request){
		ErrorDetail detail=new ErrorDetail();
		detail.setContect("harman.support@harman.com");
		detail.setDateTime(LocalDateTime.now());
		detail.setMeesage(ex.getMessage());
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(detail);
	}
}


