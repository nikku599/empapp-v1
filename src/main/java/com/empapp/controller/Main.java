package com.empapp.controller;

import java.util.List;

import com.empapp.dao.Employee;
import com.empapp.service.EmployeeService;
import com.empapp.service.EmployeeServiceImplementation;

public class Main {
	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeServiceImplementation();
		List<Employee> allEmployees = employeeService.getAll();
		allEmployees.forEach(e -> System.out.println(e));
	}
}
