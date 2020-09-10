package com.example.workshopmicroservices.springhystrixschoolservice.controller;

import com.example.workshopmicroservices.springhystrixschoolservice.delegate.StudentServiceDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchoolServiceController {
	
	@Autowired
    StudentServiceDelegate studentServiceDelegate;

	// endpoint to get students (/getSchoolDetails/{schoolname})
	// this method must return a student after calling method tagged by hystrix

}
