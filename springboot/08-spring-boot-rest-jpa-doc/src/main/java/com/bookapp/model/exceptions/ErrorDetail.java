package com.bookapp.model.exceptions;

import java.time.LocalDateTime;

public class ErrorDetail {
	
	private String meesage;
	private LocalDateTime dateTime;
	private String contect;
	public ErrorDetail(String meesage, LocalDateTime dateTime, String contect) {
		super();
		this.meesage = meesage;
		this.dateTime = dateTime;
		this.contect = contect;
	}
	public String getMeesage() {
		return meesage;
	}
	public void setMeesage(String meesage) {
		this.meesage = meesage;
	}
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	public String getContect() {
		return contect;
	}
	public void setContect(String contect) {
		this.contect = contect;
	}
	public ErrorDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
