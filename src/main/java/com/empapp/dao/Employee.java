package com.empapp.dao;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
	private int id;
	private String name;
	private double salary;
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	
}
