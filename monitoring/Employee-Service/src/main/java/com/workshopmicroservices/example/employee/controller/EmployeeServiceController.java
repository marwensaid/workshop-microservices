package com.workshopmicroservices.example.employee.controller;

import java.util.HashMap;
import java.util.Map;

import com.workshopmicroservices.example.employee.beans.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// this class is a REST Controller
@RestController
public class EmployeeServiceController {
	
	
	private static final Map<Integer, Employee> employeeData = new HashMap<Integer, Employee>() {
		/**
		 * 
		 */
		private static final long serialVersionUID = -3970206781360313502L;

		// add 2 ou 3 employee


    };
 
    public Employee getEmployeeDetails(@PathVariable int employeeId) {
        System.out.println("Getting Employee details for " + employeeId);

        // method to get employee detail by id
		// this class attack this endpoint /findEmployeeDetails/{employeeId}

        return null;
    }

}
