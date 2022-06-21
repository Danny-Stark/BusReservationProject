package com.morningstar.service;

import com.morningstar.model.Person;

public interface RegistrationService {
	public int addPerson(Person p);
	public int checkUserInfo(String emailId,String password);
	
}
