package com.Rupeshk_3150001_NAGP2_userservice.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	
	@Autowired
	private UserRepository repository;

	@GetMapping(path="/user/{id}") //to find one user
	public User retrieveUser(@PathVariable int id) {
		
		User user = repository.findById(id).orElse(null);
		
		if(user==null)
		throw new UserNotFoundException("id-"+id); ///for exception handing if user not found
		return user;
		}


}
