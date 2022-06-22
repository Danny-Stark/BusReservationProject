package com.morningstar.dao;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import com.morningstar.model.Bus;
import com.morningstar.model.Customer;
import com.morningstar.model.Tickets;

public interface UserDao {

	
	public Customer getUserInfo(int id);
	public List<Bus> getBusBySourceAndDestination(String source,String destination);
	public List<Bus> getBusBYBetweenTime(Timestamp departTime,Timestamp arriveTime);
	public List<Bus> getBusForDate(Date date);
	public List<Tickets> getUserTicketInfo(int id);
	public int cancelTickets(int fId,int sId);
	public int booktickets(int fId,int sID);
}
