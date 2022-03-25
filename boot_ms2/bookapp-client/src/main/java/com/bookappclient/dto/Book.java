package com.bookappclient.dto;

public class Book {
	
	private Integer id;
	private String title;
	private Double price;
	
	public Book() {}
	
	public Book(String title, Double price) {
		this.title = title;
		this.price = price;
	}

	public Book(Integer id, String title, Double price) {
		this.id = id;
		this.title = title;
		this.price = price;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", price=" + price + "]";
	}

	
}
