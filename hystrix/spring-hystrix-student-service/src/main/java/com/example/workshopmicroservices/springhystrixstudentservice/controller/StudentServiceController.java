package com.example.workshopmicroservices.springhystrixstudentservice.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.workshopmicroservices.springhystrixstudentservice.domain.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

public class StudentServiceController {


	// create a Map : key : string, value List of student


	static {
// create static bd

	}

	// rest annotation
	public List<Student> getStudents(@PathVariable String schoolname) {
		System.out.println("Getting Student details for " + schoolname);

		// method core to get student and manage if null

		return null;

	}
}
