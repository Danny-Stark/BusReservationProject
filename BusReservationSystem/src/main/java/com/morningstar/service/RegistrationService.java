package com.morningstar.service;

import com.morningstar.model.Customer;

public interface RegistrationService {
	public int addCustomer(Customer p);
	public Customer checkUserInfo(String emailId,String password);
	
}
