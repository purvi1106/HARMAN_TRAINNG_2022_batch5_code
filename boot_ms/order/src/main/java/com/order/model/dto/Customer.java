package com.order.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class Customer {
	private int id;
	private String name;
	private String email;
	public Customer(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	
	
	
}
