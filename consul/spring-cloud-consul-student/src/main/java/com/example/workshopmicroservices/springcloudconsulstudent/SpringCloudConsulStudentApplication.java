package com.example.workshopmicroservices.springcloudconsulstudent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


// this is client discovery
@SpringBootApplication
public class SpringCloudConsulStudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConsulStudentApplication.class, args);
	}
}
