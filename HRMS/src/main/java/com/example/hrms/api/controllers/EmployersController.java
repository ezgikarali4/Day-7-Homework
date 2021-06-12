package com.example.hrms.api.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.hrms.business.abstracts.EmployerService;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.entities.concretes.Employer;

@RestController
@RequestMapping("/api/employers")
public class EmployersController {

	private EmployerService employerService;

	@Autowired
	public EmployersController(EmployerService employerService) {
		super();
		this.employerService = employerService;
	}
	
	@GetMapping("/getall")
	public List<Employer> getAll() {
		
		return this.employerService.getAll();
	}

	@PostMapping("/add")
	public Result add(Employer employer) {
		return this.employerService.add(employer);
	}

	

	@DeleteMapping("/delete")
	public Result delete(@RequestBody Employer employer) {
		
		return this.employerService.delete(employer);
	}
	
}
