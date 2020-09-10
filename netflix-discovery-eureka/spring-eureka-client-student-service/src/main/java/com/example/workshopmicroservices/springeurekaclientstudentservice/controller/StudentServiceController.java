package com.example.workshopmicroservices.springeurekaclientstudentservice.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.workshopmicroservices.springeurekaclientstudentservice.domain.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentServiceController {

	// create a school DB and insert : 2 school / 2 student by school

	// the mapping is : Get + endpoint : /getStudentDetailsForSchool/{schoolname}
	public List<Student> getStudents(@PathVariable String schoolname) {

		return null;
	}
}
