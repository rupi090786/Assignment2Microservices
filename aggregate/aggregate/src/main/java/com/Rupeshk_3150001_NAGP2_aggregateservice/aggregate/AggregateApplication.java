package com.Rupeshk_3150001_NAGP2_aggregateservice.aggregate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.Rupeshk_3150001_NAGP2_aggregateservice.aggregate")
public class AggregateApplication {

	public static void main(String[] args) {
		SpringApplication.run(AggregateApplication.class, args);
	}

}
