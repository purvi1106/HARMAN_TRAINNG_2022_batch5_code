package com.order.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.order.model.dto.OrderRequest;
import com.order.model.dto.Product;

@Service
public class ProductServiceProxy {
	@Autowired
	private RestTemplate restTemplate;
	
	//-------------------calling to product ms----------------
		@HystrixCommand(fallbackMethod = "getProductFallBack")
		public Product getProduct(OrderRequest orderRequest) {
			String PRODUCT_URL = "http://PRODUCT-SERVICE/productapp/products/" + orderRequest.getPid();
			Product product = restTemplate.getForObject(PRODUCT_URL, Product.class);
			return product;
		}

		//-------------------fallback logic of product ms----------------
		public Product getProductFallBack(OrderRequest orderRequest) {
			Product product=new Product();
			product.setId(orderRequest.getPid());
			return product;
		}

}
