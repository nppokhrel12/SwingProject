package com.service;

import java.util.List;

import com.model.Employee;

public interface EmployeeService {
	boolean addEmployee(Employee emp);
	boolean deleteEmployee(int id);
	boolean updateEmployee(Employee emp);
	Employee getById(int id);
	List<Employee> getAllEmployees();
	List<Employee> search(String data);
}
