package com.example.workshopmicroservices.springhystrixschoolservice.delegate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

// Service class
public class StudentServiceDelegate {
	@Autowired
	RestTemplate restTemplate;
	
	// implement a callStudentService method and enabled it by hystrix. we wanna return student detail with a normal flow

	// implement a fallback method

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
