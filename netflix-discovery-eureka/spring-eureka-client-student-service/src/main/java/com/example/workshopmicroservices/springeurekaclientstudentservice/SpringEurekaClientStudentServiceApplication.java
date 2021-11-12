package com.example.workshopmicroservices.springeurekaclientstudentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// enable a Eureka client
public class SpringEurekaClientStudentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaClientStudentServiceApplication.class, args);
	}
}
