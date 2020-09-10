package com.example.workshopmicroservices.springcloudconsulschool.delegate;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

public class StudentServiceDelegate {

	// get data for student service (call endpoint) retrieve school name + student details + date of transaction
	// think about load balancer and restTemplate
}
