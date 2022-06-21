package com.morningstar.service;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.morningstar.dao.RegistrationDao;
import com.morningstar.dao.UserDao;
import com.morningstar.model.Bus;
import com.morningstar.model.Person;
import com.morningstar.model.Tickets;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao dao = null;
	
	public UserDao getDao() {
		return dao;
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}
	@Override
	public Person getUserInfo(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bus> getBusBySourceAndDestination(String source, String destination) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bus> getBusBYBetweenTime(Timestamp departTime, Timestamp arriveTime) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bus> getBusForDate(Date date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Tickets> getUserTicketInfo(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int cancelTickets(int fId, int sId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int booktickets(int fId, int sID) {
		// TODO Auto-generated method stub
		return 0;
	}



}
