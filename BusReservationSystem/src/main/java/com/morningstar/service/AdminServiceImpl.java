package com.morningstar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.morningstar.dao.AdminDao;
import com.morningstar.dao.UserDao;
import com.morningstar.model.Bus;
import com.morningstar.model.Person;
import com.morningstar.model.Tickets;

@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminDao dao = null;
	
	public AdminDao getDao() {
		return dao;
	}

	public void setDao(AdminDao dao) {
		this.dao = dao;
	}
	
	@Override
	public int addBus(Bus bus) {
		int result = dao.addBus(bus);
		return result;	
	}

	@Override
	public int removeBus(int bId) {
		int result = dao.removeBus(bId);
		return result;	
	}

	@Override
	public int updateBusById(Bus bus, int busId) {
		int result = dao.updateBusById(bus, busId);
		return result;
	}
	
	@Override
	public List<Tickets> getBusTicketInfo(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bus> getAllBuses() {
		List<Bus> list = dao.getAllBuses();
		return list;
	}

	

}
