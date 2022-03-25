package com.order.model.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderResponse {
	private String id;
	private double totalAmount;
	private Date orderDate;
	private Customer customer;
	private Product product;
}
