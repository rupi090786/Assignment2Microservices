package com.Rupeshk_3150001_NAGP2_orderservice.order;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Component;

@Component
public class ordersDaoService {
	
private static List<orders> order= new ArrayList<>();
	
	private static int ordersCount =15;
	
	
	static {
		order.add(new orders(1,100,4500, "27-Jan-2020"));
		order.add(new orders(1,103,250, "01-Feb-2020"));
		order.add(new orders(1,110,1100, "14-Feb-2020"));
		order.add(new orders(2,101,360, "28-Jan-2020"));
		order.add(new orders(2,107,1400, "31-Jan-2020"));
		order.add(new orders(3,104,1290, "02-Feb-2020"));
		order.add(new orders(3,154,9000, "04-Mar-2020"));
		order.add(new orders(3,162,598, "06-Mar-2020"));
		order.add(new orders(4,153,6600, "20-Feb-2020"));
		order.add(new orders(4,178,999, "27-Jan-2020"));
		order.add(new orders(4,190,8700, "28-Mar-2020"));
		order.add(new orders(4,203,500, "29-Mar-2020"));
		order.add(new orders(5,181,4500, "20-Mar-2020"));
		order.add(new orders(5,189,1009, "14-Mar-2020"));
		order.add(new orders(5,201,678, "28-Mar-2020"));
	
		
	}
	public List<orders> findAll(){
	return order;
	}
	public orders save(orders orders) {
		if (orders.getOrderID()== null) {	
			orders.setOrderID(++ordersCount);
					}
		order.add(orders);
		return orders;
		
	}
//	public orders findOne(int orderID) {
//		for (orders order:order) {
//			if (order.getOrderID()==orderID) {
//				return order;
//			}	
//		}
//		return null;
//	}

	

}