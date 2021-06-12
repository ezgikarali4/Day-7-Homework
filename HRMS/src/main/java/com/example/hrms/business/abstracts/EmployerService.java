package com.example.hrms.business.abstracts;

import java.util.List;

import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.entities.concretes.Employer;

public interface EmployerService {

	public Result add(Employer employer);

	public Result update(Employer employer);

	public Result delete(Employer employer);
	
	public List<Employer> getAll();
}
