package com.morningstar.service;

import java.util.List;

import com.morningstar.model.Bus;

import com.morningstar.model.Customer;
import com.morningstar.model.Tickets;

public interface AdminService {

	public int addBus(Bus bus);
	public int removeBus(int bId);
	public int updateBusById(Bus bus, int busId);
	public List<Tickets> getBusTicketInfo(int id);
	public List<Customer> getAllUsers();
	public List<Bus> getAllBuses();
	public Bus findBusById(int bId);
}
