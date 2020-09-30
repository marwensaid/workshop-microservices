package com.example.workshopmicroservices.springhystrixschoolservice.delegate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

// Service class
@Service
public class StudentServiceDelegate {
	@Autowired
	RestTemplate restTemplate;
	
	// implement a callStudentService method and enabled it by hystrix. we wanna return student detail with a normal flow

	public String callStudentServiceAndGetData(String schoolname){

		System.out.println("Getting School details for " + schoolname);
		String response = restTemplate
				.exchange("http://localhost:8098/getStudentDetailsForSchool/{schoolname}"
						, HttpMethod.GET
						, null
						, new ParameterizedTypeReference<String>() {
						}, schoolname).getBody();

		System.out.println("Response Received as " + response + " -  " + new Date());

		return "NORMAL FLOW !!! - School Name -  " + schoolname + " :::  Student Details " + response + " -  " + new Date();
	}
	// implement a fallback method
	@SuppressWarnings("unused")
	private String callStudentServiceAndGetData_Fallback(String schoolname) {
		System.out.println("Student Service is down!!! fallback route enabled...");
		return "CIRCUIT BREAKER ENABLED!!!No Response From Student Service at this moment. Service will be back shortly - " + new Date();
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
