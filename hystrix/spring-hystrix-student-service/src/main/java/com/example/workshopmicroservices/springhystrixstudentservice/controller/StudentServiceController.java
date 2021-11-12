package com.example.workshopmicroservices.springhystrixstudentservice.controller;

import com.example.workshopmicroservices.springhystrixstudentservice.domain.Student;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

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
