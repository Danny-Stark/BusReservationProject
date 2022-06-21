package com.morningstar.dao;

import java.util.List;

import com.morningstar.model.Bus;
import com.morningstar.model.Person;
import com.morningstar.model.Tickets;

public interface AdminDao {

	public int addBus(Bus bus);
	public int removeBus(int bId);
	public int updateBusById(Bus bus, int busId);
	public List<Tickets> getBusTicketInfo(int id);
	public List<Person> getAllUsers();
	public List<Bus> getAllBuses();
}
