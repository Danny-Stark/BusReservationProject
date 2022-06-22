package com.morningstar.dao;

import com.morningstar.model.Customer;

public interface RegistrationDao {
	public int addCustomer(Customer p);
	public Customer checkUserInfo(String emailId,String password);
	
}
