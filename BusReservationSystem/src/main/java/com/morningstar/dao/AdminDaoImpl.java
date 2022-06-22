package com.morningstar.dao;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.morningstar.model.Bus;
import com.morningstar.model.Customer;
import com.morningstar.model.Tickets;

@Repository
public class AdminDaoImpl implements AdminDao{

	@Autowired
	private JdbcTemplate template = null;
	
	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	@Override
	public int addBus(Bus bus) {
		bus.setIsBooked("No");
		String query = "Insert Into Bus1(BId ,BUSNAME, SOURCE, DESTINATION, DEPARTDATE, DEPARTTIME, ARRIVEDATE, ARRIVETIME, ISBOOKED) Values(bus_seq.nextval,?, ?, ?, ?, ?, ?, ?, ?)";
		int result = template.update(query, bus.getBusName(), bus.getSource(), bus.getDestination(), bus.getDeparDate(), bus.getDepartTime(), bus.getArriveDate(), bus.getArriveTime(), bus.getIsBooked());
		
		String query3 = "Select * From Bus1 order by bid ";
		
		List<Bus> list = template.query(query3, (ResultSet rs, int rowNum) ->{
			Bus bus2 = new Bus();
			bus.setbId(rs.getInt("BID"));
			bus.setBusName(rs.getString("BUSNAME"));
			bus.setSource(rs.getString("SOURCE"));
			bus.setDestination(rs.getString("DESTINATION"));
			bus.setDeparDate(rs.getString("DEPARTDATE"));
			bus.setDepartTime(rs.getString("DEPARTTIME"));
			bus.setArriveDate(rs.getString("ARRIVEDATE"));
			bus.setArriveTime(rs.getString("ARRIVETIME"));
			bus.setIsBooked(rs.getString("ISBOOKED"));
			return bus;
		});
		
		Bus b1=list.get(0);
		
		int busIdd=b1.getbId();
		
		
		
		String query2="Insert into ticket(TICKETID,SEATID,BID,PRICE,STATUS) Values(ticket_seq.nextval,?,?, ?, ?)";
		for(int i=1;i<11;i++)
		{
			template.update(query2, i,busIdd,1000, "false");
			
		}
		return result;
	}

	@Override
	public int removeBus(int bId) {
		String query = "delete from Bus1 where BID=?";
		int result = template.update(query, bId);
		return result;
	}

	@Override
	public int updateBusById(Bus bus, int busId) {
		String query = "update Bus1 set " + "BUSNAME = ?, SOURCE = ?, DESTINATION = ?, DEPARTDATE = ?, DEPARTTIME = ? , ARRIVEDATE = ? , ARRIVETIME = ? , ISBOOKED = ?" + "where BID =?";
		int result=template.update(query, bus.getBusName(), bus.getSource(), bus.getDestination(), bus.getDeparDate(), bus.getDepartTime(), bus.getArriveDate(), bus.getArriveTime(),
				bus.getIsBooked(), busId);
		
		return result;
	}
	
	@Override
	public List<Tickets> getBusTicketInfo(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bus> getAllBuses() {
		String query = "Select * From Bus1 order by bid";
		List<Bus> list = template.query(query, (ResultSet rs, int rowNum) ->{
			Bus bus = new Bus();
			bus.setbId(rs.getInt("BID"));
			bus.setBusName(rs.getString("BUSNAME"));
			bus.setSource(rs.getString("SOURCE"));
			bus.setDestination(rs.getString("DESTINATION"));
			bus.setDeparDate(rs.getString("DEPARTDATE"));
			bus.setDepartTime(rs.getString("DEPARTTIME"));
			bus.setArriveDate(rs.getString("ARRIVEDATE"));
			bus.setArriveTime(rs.getString("ARRIVETIME"));
			bus.setIsBooked(rs.getString("ISBOOKED"));
			return bus;
		});
		//System.out.println(list);
		return list;
	}

	@Override
	public Bus findBusById(int bId) {
		String query = "Select * From Bus1 Where BID = "+bId;
		Bus result = template.queryForObject(query, (ResultSet rs, int rowNum) ->{
			Bus bus = new Bus();
			bus.setbId(rs.getInt("BID"));
			bus.setBusName(rs.getString("BUSNAME"));
			bus.setSource(rs.getString("SOURCE"));
			bus.setDestination(rs.getString("DESTINATION"));
			bus.setDeparDate(rs.getString("DEPARTDATE"));
			bus.setDepartTime(rs.getString("DEPARTTIME"));
			bus.setArriveDate(rs.getString("ARRIVEDATE"));
			bus.setArriveTime(rs.getString("ARRIVETIME"));
			bus.setIsBooked(rs.getString("ISBOOKED"));
			return bus;
		});
		return result;
	}

	

}
