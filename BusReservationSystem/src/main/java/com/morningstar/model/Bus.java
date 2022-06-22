package com.morningstar.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.OneToMany;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class Bus {
	private int bId;
	private String busName;
	private String source;
	private String destination;
	private String deparDate;
	private String departTime;
	private String arriveDate;
	private String arriveTime;
	private String isBooked;

//	@OneToMany(mappedBy = "bus")
//	private List<Tickets> tickets = new ArrayList<>();
//
//	public List<Tickets> getTickets() {
//		return tickets;
//	}
//
//	public void setTickets(List<Tickets> tickets) {
//		this.tickets = tickets;
//	}

	public Bus() {
	}

	public Bus(int bId, String busName, String source, String destination, String deparDate, String departTime,
			String arriveDate, String arriveTime, String isBooked) {
		super();
		this.bId = bId;
		this.busName = busName;
		this.source = source;
		this.destination = destination;
		this.deparDate = deparDate;
		this.departTime = departTime;
		this.arriveDate = arriveDate;
		this.arriveTime = arriveTime;
		this.isBooked = isBooked;
	}

	public int getbId() {
		return bId;
	}

	public void setbId(int bId) {
		this.bId = bId;
	}

	public String getBusName() {
		return busName;
	}

	public void setBusName(String busName) {
		this.busName = busName;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDeparDate() {
		return deparDate;
	}

	public void setDeparDate(String deparDate) {
		this.deparDate = deparDate;
	}

	public String getDepartTime() {
		return departTime;
	}

	public void setDepartTime(String departTime) {
		this.departTime = departTime;
	}

	public String getArriveDate() {
		return arriveDate;
	}

	public void setArriveDate(String arriveDate) {
		this.arriveDate = arriveDate;
	}

	public String getArriveTime() {
		return arriveTime;
	}

	public void setArriveTime(String arriveTime) {
		this.arriveTime = arriveTime;
	}

	public String getIsBooked() {
		return isBooked;
	}

	public void setIsBooked(String isBooked) {
		this.isBooked = isBooked;
	}

	@Override
	public String toString() {
		return "Bus [bId=" + bId + ", busName=" + busName + ", source=" + source + ", destination=" + destination
				+ ", deparDate=" + deparDate + ", departTime=" + departTime + ", arriveDate=" + arriveDate
				+ ", arriveTime=" + arriveTime + ", isBooked=" + isBooked + "]";
	}

}
