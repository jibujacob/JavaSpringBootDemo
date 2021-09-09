package com.jj.springdemo.thymeleafdemo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jj.springdemo.thymeleafdemo.entity.Employee;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
	
	private List<Employee> employeeList;
	
	@PostConstruct
	private void loadData() {
		Employee emp1 = new Employee("Jibu","Jacob","jibu@gmail.com");
		Employee emp2 = new Employee("Sijin","Mathews","sijin@gmail.com");
		Employee emp3 = new Employee("Jeenu","Jacob","jeenu@gmail.com");
		employeeList = new ArrayList<>();
		employeeList.add(emp1);
		employeeList.add(emp2);
		employeeList.add(emp3);
	}
	
	@GetMapping("/list")
	public String getEmployees(Model model) {
		
		model.addAttribute("empList",employeeList);
		
		return "employee-list";
	}

}
