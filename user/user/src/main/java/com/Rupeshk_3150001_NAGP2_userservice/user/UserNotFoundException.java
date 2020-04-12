package com.Rupeshk_3150001_NAGP2_userservice.user;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)// to provide actual error 
	public class UserNotFoundException extends RuntimeException {

		public UserNotFoundException(String message) {
			super(message);			
		}
	}
