package com.order.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.order.model.dto.Customer;
import com.order.model.dto.OrderRequest;

@Service
public class CustomerServiceProxy {
	@Autowired
	private RestTemplate restTemplate;

	// -------------------calling to customer ms----------------
	@HystrixCommand(fallbackMethod = "getCustomerFallBack")
	public Customer gutCustoer(OrderRequest orderRequest) {
		String CUSTOMER_URL = "http://CUSTOMER-SERVICE/custmerapp/customers/" + orderRequest.getCid();
		Customer customer = restTemplate.getForObject(CUSTOMER_URL, Customer.class);
		return customer;
	}

	// -------------------fallback logic for customer ms----------------
	public Customer getCustomerFallBack(OrderRequest orderRequest) {
		Customer customer = new Customer();
		customer.setId(orderRequest.getCid());
		return customer;
	}
}
