package com.example.hrms.core.abstracts;

import com.example.hrms.entities.concretes.JobSeeker;


public interface MernisCheckService {
	
	public boolean checkIfRealPerson(JobSeeker jobSeeker);

}
