package com.example.hrms.business.concretes;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.JobService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.dataAccess.abstracts.JobDao;
import com.example.hrms.entities.concretes.Job;

import com.example.hrms.core.utilities.results.SuccessDataResult;
import com.example.hrms.core.utilities.results.SuccessResult;


@Service
public class JobManager implements JobService{

	private JobDao jobDao;
	
	@Autowired //productdaoyu enjekte edicek ortamı veriyor
	public JobManager(JobDao jobDao) {
		super();
		this.jobDao = jobDao;
	}


	@Override
	public DataResult<List<Job>> getAll() {
		return new SuccessDataResult<List<Job>>
		(this.jobDao.findAll(), "Data listelendi");	
	
	}


	@Override
	public Result add(Job job) {
		this.jobDao.save(job);
		return new SuccessResult("İş eklendi.");

	}

}
