package com.example.hoverflyactualserviceclient;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class HoverflyActualServiceClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(HoverflyActualServiceClientApplication.class, args);
	}
}

@RestController
class TestController {

	private static final int HOVERFLY_PORT = 8500;
	private static final String HOVERFLY_HOST = "localhost";
	private static final String PROXY = "proxy";

	// we gonna expose /invoke endpoint
	public String invoke() {
		System.out.println("inside TestController::invoke()");
		String url = "http://localhost:9080/service/hoverfly";
		String response = "How can I call the logic of restTemplate";
		System.out.println("Actual Response : " + response);
		return response;
	}

	@Bean
	public RestTemplate restTemplate() {

		String mode = System.getProperty("mode");
		System.out.println("##################### Mode ################# " + mode);

		SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
		Proxy proxy = new Proxy(Type.HTTP, new InetSocketAddress(HOVERFLY_HOST, HOVERFLY_PORT));
		requestFactory.setProxy(proxy);
		RestTemplate template = null;

        // implement logic mode for restTemplate

		return template;
	}

	@Autowired
	RestTemplate restTemplate;
}