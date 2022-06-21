package com.morningstar.dao;

import com.morningstar.model.Person;

public interface RegistrationDao {
	public int addPerson(Person p);
	public Person checkUserInfo(String emailId,String password);
	
}
