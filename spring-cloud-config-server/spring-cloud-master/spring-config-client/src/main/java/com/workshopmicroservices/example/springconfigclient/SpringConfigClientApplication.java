package com.workshopmicroservices.example.springconfigclient;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;

//this is a spring boot application
public class SpringConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringConfigClientApplication.class, args);
	}

	//here we wanna a setEnv method getting property environment "msg" from conf (think about injection)
}

// this is a rest controller class with scope
class MessageRestController {

	// specify msg value (from conf) and put it into a string


	@GetMapping("/msg")
	// getting from /msg (http)
	// /msg get endpoint
	public void getMsg() {
		// just return a msg
	}
}
