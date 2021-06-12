package com.example.hrms.business.abstracts;

import java.util.List;


import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.entities.concretes.User;

public interface UserService {

	Result addUserAccount(User user);
	boolean addVerificationEmail(User user);
	boolean signUp(User user);
	
	User getUser(int id);
	DataResult<List<User>> getAll();
	Result add(User user);

}
