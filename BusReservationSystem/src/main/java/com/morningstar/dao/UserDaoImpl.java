package com.morningstar.dao;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.morningstar.model.Bus;
import com.morningstar.model.Person;
import com.morningstar.model.Tickets;

@Repository
public class UserDaoImpl implements UserDao{

	@Autowired
	private JdbcTemplate template = null;
	
	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
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
