package com.example.hrms.core.concretes;

import com.example.hrms.core.abstracts.MernisCheckService;
import com.example.hrms.entities.concretes.JobSeeker;

public class FakeMernisManager implements MernisCheckService {

	@Override
	public boolean checkIfRealPerson(JobSeeker jobSeeker) {
		return true;
	}

}
