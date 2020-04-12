package com.Rupeshk_3150001_NAGP2_orderservice.order;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class OrderNotFoundException extends RuntimeException {
	
	public OrderNotFoundException(String message) {
		super(message);			
	}

}
