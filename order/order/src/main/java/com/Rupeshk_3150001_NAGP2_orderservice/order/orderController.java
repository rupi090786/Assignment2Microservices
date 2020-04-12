package com.Rupeshk_3150001_NAGP2_orderservice.order;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class orderController {
	
	@Autowired  //As we used component in orderdaoservice, we are telling to autowire them her
	private ordersDaoService services;

	@GetMapping(path="/order/{id}")
	public List<orders> Getorderbyuserid(@PathVariable int id ) {
		List<orders> orderbyuserid=services.findAll();
		List<orders> finaorderbyuserid = new ArrayList<>();

		
			for(orders val : orderbyuserid)
			{
				if (val.getId()==id)
						
					finaorderbyuserid.add(val);
			}
	
         return finaorderbyuserid;
}
}