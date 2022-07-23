package com.empapp.dao;

import java.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.sql.*;

import com.empapp.exception.EmployeeNotFoundException;
import com.empapp.utils.ConnectionFactory;

public class EmployeeDaoImplementation implements EmployeeDao {
	private Connection connection = null;
	private Logger logger = null;

	public EmployeeDaoImplementation() {
		this.connection = ConnectionFactory.getConnection();
		logger = LoggerFactory.getLogger(EmployeeDaoImplementation.class);
		logger.info("logger initialized");
	}

	@Override
	public List<Employee> getAll() {
		Statement statement;
		List<Employee> employees = new ArrayList<>();
		try {
			statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select * from emp");
			while(rs.next()) {
				employees.add(new Employee(rs.getInt(1),rs.getString(2),rs.getDouble(3)));
			}
		} catch (SQLException e) {
			logger.info(e.toString());
		}

		return employees;
	}

	@Override
	public Employee getById(int id) {
		PreparedStatement pstmt;
		Employee employee = null;
		try {
			pstmt = connection.prepareStatement("select * from emp where id = ?");
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				employee = new Employee(rs.getInt(1),rs.getString(2),rs.getDouble(3));
			}else {
				throw new EmployeeNotFoundException();
			}
		} catch (SQLException e) {
			logger.warn(e.toString());
		}
		
		return employee;
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
