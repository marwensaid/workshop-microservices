package com.example.workshopmicroservices.springeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// enable Eureka server
@SpringBootApplication
public class SpringEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaServerApplication.class, args);
	}
}
