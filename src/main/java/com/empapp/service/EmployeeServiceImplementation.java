package com.empapp.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.empapp.dao.Employee;
import com.empapp.dao.EmployeeDao;
import com.empapp.dao.EmployeeDaoImplementation;

public class EmployeeServiceImplementation implements EmployeeService {
	private EmployeeDao employeedao = null;
	private Logger logger = null;

	public EmployeeServiceImplementation() {
		employeedao = new EmployeeDaoImplementation();
		logger = LoggerFactory.getLogger(EmployeeServiceImplementation.class);
	}

	@Override
	public List<Employee> getAll() {
		long start = System.currentTimeMillis();
		List<Employee> employees = employeedao.getAll();
		long end = System.currentTimeMillis();
		logger.info("Time taken to getAll() : " + (end - start) + "ms");
		return employees;
	}

	@Override
	public Employee getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee updateEmployee(int id, double salary) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee deleteEmployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
