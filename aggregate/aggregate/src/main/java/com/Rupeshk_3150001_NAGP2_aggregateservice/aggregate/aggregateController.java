package com.Rupeshk_3150001_NAGP2_aggregateservice.aggregate;

import java.util.List;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class aggregateController {
	
	@Autowired
	
	private orderserviceproxy proxy2;
	
	@Autowired
	private userproxyservice proxy1;
	
	
	//@GetMapping("/orderdetails/{id}")
	public List<aggregator> aggregateUS(@PathVariable int id){
		List<aggregator>  response1=proxy2.Getorderbyuserid(id);
		return (response1);
}
	//@GetMapping("/orderdetails/{id}")
	public aggregateorder aggregateorders(@PathVariable int id)
	{
		aggregateorder response2=proxy1.retrieveUser(id);
		
		return response2;
	}
	
	@GetMapping("/orderdetails/{id}")
	
	
	  public String UserOrderDetails(@PathVariable int id) { 
		List<aggregator> response1=proxy2.Getorderbyuserid(id); 
		aggregateorder response2=proxy1.retrieveUser(id); 
	  JSONObject response = new JSONObject();
	  
	  response.put("Userdetails",response2);
	  response.put("Orderdetails",response1);
	  
	  return response.toString(); 
	  }
}
