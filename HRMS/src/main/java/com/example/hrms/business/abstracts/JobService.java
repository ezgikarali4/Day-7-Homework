package com.example.hrms.business.abstracts;

import java.util.List;



import com.example.hrms.entities.concretes.Job;

import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;


public interface JobService {
	
	DataResult<List<Job>> getAll(); //list of product döndürücez
	Result add(Job job);
}
