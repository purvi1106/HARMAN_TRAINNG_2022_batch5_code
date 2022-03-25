package com.order.web.controller;

import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.order.model.dto.Coupon;
import com.order.model.dto.Customer;
import com.order.model.dto.OrderRequest;
import com.order.model.dto.OrderResponse;
import com.order.model.dto.Product;
import com.order.model.service.CouponServiceProxy;
import com.order.model.service.CustomerServiceProxy;
import com.order.model.service.ProductServiceProxy;

@RestController
public class OrderRestController {

	@Autowired
	private CouponServiceProxy couponServiceProxy;

	@Autowired
	private ProductServiceProxy productServiceProxy;

	@Autowired
	private CustomerServiceProxy customerServiceProxy;

	// @HystrixCommand(fallbackMethod = "bookOrderDummyResponse")
	@PostMapping(path = "orders")
	public ResponseEntity<OrderResponse> bookOrder(@RequestBody OrderRequest orderRequest) {
		// the main thing is that ie order ms need to
		// communicate to other ms... customer, product, coupon
		// use restTemplate

		Customer customer = customerServiceProxy.gutCustoer(orderRequest);

		Product product = productServiceProxy.getProduct(orderRequest);

		Coupon coupon = couponServiceProxy.getCoupon(orderRequest);

		OrderResponse orderResponse = new OrderResponse();
		orderResponse.setId(UUID.randomUUID().toString());
		orderResponse.setCustomer(customer);
		orderResponse.setProduct(product);
		orderResponse.setOrderDate(new Date());
		// i need to calulate net price
		double totalAmount = product.getPrice() * orderRequest.getQty() * (100 - coupon.getDiscountPercentage()) / 100;

		orderResponse.setTotalAmount(totalAmount);

		return ResponseEntity.status(HttpStatus.CREATED).body(orderResponse);
	}

}
