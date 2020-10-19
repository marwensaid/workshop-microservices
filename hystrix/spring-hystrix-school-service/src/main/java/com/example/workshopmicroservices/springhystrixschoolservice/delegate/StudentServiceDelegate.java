package com.example.workshopmicroservices.springhystrixschoolservice.delegate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

// Service class
public class StudentServiceDelegate {
	@Autowired
	RestTemplate restTemplate;
	
	// implement a callStudentService method and enabled it by hystrix. we wanna return student detail with a normal flow
	// this a http exchange

	public String callStudentServiceAndGetData(String schoolname){

		return "";
	}



	// implement a fallback method




	// this is a bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
