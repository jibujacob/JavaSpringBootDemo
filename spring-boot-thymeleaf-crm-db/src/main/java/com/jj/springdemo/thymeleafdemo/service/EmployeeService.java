package com.jj.springdemo.thymeleafdemo.service;

import java.util.List;

import com.jj.springdemo.thymeleafdemo.entity.Employee;

public interface EmployeeService {
	public List<Employee> getEmployees();
	public Employee getEmployeeById(int id);
	public void save(Employee employee);
	public void deleteById(int id);
	
}
