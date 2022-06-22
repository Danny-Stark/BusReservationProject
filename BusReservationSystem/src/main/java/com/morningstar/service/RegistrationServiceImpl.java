package com.morningstar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.morningstar.dao.RegistrationDao;
import com.morningstar.model.Customer;

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
	public int addCustomer(Customer p) {	
		int result = dao.addCustomer(p);
		return result;	
	}

	@Override
	public Customer checkUserInfo(String emailId, String password) {
		return dao.checkUserInfo(emailId, password);
		
	}

}
