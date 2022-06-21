package com.morningstar.dao;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.morningstar.model.Bus;
import com.morningstar.model.Person;
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
		String query = "Insert Into Bus(BId ,BUSNAME, SOURCE, DESTINATION, DEPARTDATE, DEPARTTIME, ARRIVETIME, ISBOOKED) Values(user_seq.nextval,?, ?, ?, ?, ?, ?, ?)";
		int result = template.update(query, bus.getBusName(), bus.getSource(), bus.getDestination(), bus.getDeparDate(), bus.getArriveTime(), bus.getIsBooked());
		return result;
	}

	@Override
	public int removeBus(int bId) {
		String query = "delete from Bus where BID=?";
		int result = template.update(query, bId);
		return result;
	}

	@Override
	public int updateBusById(Bus bus, int busId) {
		String query = "update Bus set " + "BID = ?, BUSNAME = ?, SOURCE = ?, DESTINATION = ?, DEPARTDATE = ?, DEPARTTIME = ? , ARRIVETIME = ? , ISBOOKED = ?" + "where BID =?";
		int result=template.update(query, bus.getbId(), bus.getBusName(), bus.getSource(), bus.getDestination(), bus.getDeparDate(), bus.getArriveTime(),
				bus.getIsBooked());
		
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
		String query = "Select * From Bus";
		List<Bus> list = template.query(query, (ResultSet rs, int rowNum) ->{
			Bus bus = new Bus();
			bus.setbId(rs.getInt("BID"));
			bus.setBusName(rs.getString("BUSNAME"));
			bus.setSource(rs.getString("SOURCE"));
			bus.setDestination(rs.getString("DESTINATION"));
			bus.setDeparDate(rs.getDate("DEPARTDATE"));
			bus.setDepartTime(rs.getTimestamp("DEPARTTIME"));
			bus.setArriveTime(rs.getTimestamp("ARRIVETIME"));
			bus.setIsBooked(rs.getString("ISBOOKED"));
			return bus;
		});
		return list;
	}

	

}
