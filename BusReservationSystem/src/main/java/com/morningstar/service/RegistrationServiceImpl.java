package com.morningstar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.morningstar.dao.RegistrationDao;
import com.morningstar.model.Person;

@Service
public class RegistrationServiceImpl implements RegistrationService{
	@Autowired
	private RegistrationDao dao = null;
	
	public RegistrationDao getDao() {
		return dao;
	}

	public void setDao(RegistrationDao dao) {
		this.dao = dao;
	}
	@Override
	public int addPerson(Person p) {	
		int result = dao.addPerson(p);
		return result;	
	}

	@Override
	public int checkUserInfo(String emailId, String password) {
		Person result = dao.checkUserInfo(emailId, password);
		if(result.getEmailId().equals(emailId) && result.getPassword().equals(password))
			return 1;
		else
			return 0;
	}

}
