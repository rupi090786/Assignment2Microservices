package com.Rupeshk_3150001_NAGP2_aggregateservice.aggregate;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@FeignClient(name="user-service", url="${USER_SERVICE_URI:http://localhost}:9090")
public interface userproxyservice {
	@GetMapping(path="/user/{id}") //to find one user
	public aggregateorder retrieveUser(@PathVariable int id); 
}
