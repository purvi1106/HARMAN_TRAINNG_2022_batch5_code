package com.bookapp.web.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.bookapp.model.exceptions.BookNotFoundException;
import com.bookapp.model.exceptions.ErrorDetail;

@RestController
@ControllerAdvice
public class AppExcetpionHandler extends ResponseEntityExceptionHandler{

	
	//this is a special method to handle server side validation
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		BindingResult bindingResult = ex.getBindingResult();
		
		List<FieldError> fieldErrors = bindingResult.getFieldErrors();
		//? expore some method inside this fieldErrors and then put
		
		StringBuilder builder=new StringBuilder("validation failed for : ");
		
		for(FieldError fe:fieldErrors ) {
			builder.append(fe.getField()).append(" ,");
			
		}
		
		ErrorDetail errorDetails=new ErrorDetail();
		errorDetails.setContect("harman.support@harman.com");
		errorDetails.setDateTime(LocalDateTime.now());
		errorDetails.setMeesage(builder.toString());
		
		return new ResponseEntity<Object>(errorDetails, HttpStatus.BAD_REQUEST);
	
	}

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


