package com.order.model.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.order.model.dto.Coupon;
import com.order.model.dto.OrderRequest;

@Service
public class CouponServiceProxy {
	
	@Autowired
	private RestTemplate restTemplate;

	// -------------------coupon ms----------------
	@HystrixCommand(fallbackMethod = "getCouponFallBack")
	public Coupon getCoupon(OrderRequest orderRequest) {
		String COUPON_URL = "http://COUPON-SERVICE/couponapp/couponbycode/" + orderRequest.getDiscountCoupon();
		Coupon coupon = restTemplate.getForObject(COUPON_URL, Coupon.class);
		return coupon;
	}

	// -------------------coupon ms fallback method----------------
	public Coupon getCouponFallBack(OrderRequest orderRequest) {
		Coupon coupon = new Coupon();
		coupon.setCouponCode(orderRequest.getDiscountCoupon());
		coupon.setDiscountPercentage(5);
		coupon.setExpiredOn(new Date());
		coupon.setId(121);
		return coupon;
	}
}
