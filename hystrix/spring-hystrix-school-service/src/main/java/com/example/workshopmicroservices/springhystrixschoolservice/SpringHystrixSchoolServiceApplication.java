package com.example.workshopmicroservices.springhystrixschoolservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication

// we gonna use a hystrix circuit breaker
public class SpringHystrixSchoolServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringHystrixSchoolServiceApplication.class, args);
	}
}
