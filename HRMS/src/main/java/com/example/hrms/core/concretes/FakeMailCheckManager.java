package com.example.hrms.core.concretes;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.example.hrms.core.abstracts.MailCheckService;

@Primary
@Component
public class FakeMailCheckManager implements MailCheckService{

	@Override
	public boolean mailCheck(String email) {

		return true;
	}

}
