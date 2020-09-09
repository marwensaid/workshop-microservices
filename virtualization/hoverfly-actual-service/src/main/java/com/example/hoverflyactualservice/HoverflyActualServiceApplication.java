package com.example.hoverflyactualservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HoverflyActualServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HoverflyActualServiceApplication.class, args);
    }
}

@RestController
class MyRestController {

    @RequestMapping(value = "/service/hoverfly")
    public HoverflyServiceResponse getSampleResponse() {
        System.out.println("Inside HoverflyActualServiceApplication::getSampleResponse()");
        return new HoverflyServiceResponse();
    }

}

class HoverflyServiceResponse {

    // hoverfly response contain a message a responseTime and a transactionId

    public HoverflyServiceResponse() {
        super();
    }

}
