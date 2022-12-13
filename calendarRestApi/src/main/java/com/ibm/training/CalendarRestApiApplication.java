package com.ibm.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CalendarRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalendarRestApiApplication.class, args);
	}

}
