package com.jj.springboot.cruddemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jj.springboot.cruddemo.dao.EmployeeDAO;
import com.jj.springboot.cruddemo.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDAO employeeDAO;

	@Override
	@Transactional
	public List<Employee> getEmployees() {
		
		return employeeDAO.getEmployees();
	}

	@Override
	@Transactional
	public Employee getEmployeeById(int id) {
		
		return employeeDAO.getEmployeeById(id);
	}

	@Override
	@Transactional
	public void save(Employee employee) {
		
		employeeDAO.save(employee);
	}

	@Override
	@Transactional
	public void deleteById(int id) {
		employeeDAO.deleteById(id);

	}

}
