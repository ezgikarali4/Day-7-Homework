package com.example.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.hrms.business.abstracts.EmployeeService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.entities.concretes.Employee;

@RestController
@RequestMapping("/api/system_personnels")
public class EmployeesController {

	private EmployeeService employeeService;
	

	@Autowired
	public EmployeesController(EmployeeService employeeService) {
		super();
		this.employeeService= employeeService;
	}
	
	public DataResult<List<Employee>> getAll(){
		return this.employeeService.getAll();
	}
	
	
	public Result register(@RequestBody Employee employee) {
		return this.employeeService.register(employee);
	}
}
