package com.morningstar.model;
import java.sql.Timestamp;
import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName="prototype")
public class Bus {
	private int bId;
	private String busName;
	private String source;
	private String destination;
	private Date deparDate;
	private Timestamp departTime;
	private Timestamp arriveTime;
	private String isBooked;

//	@OneToMany(mappedBy="sId")
//	private List<Tickets> tickets=new ArrayList<>();
	
	public Bus() {
	}

	public Bus(int bId, String busName, String source, String destination, Date deparDate, Timestamp departTime,
			Timestamp arriveTime, String isBooked) {
		super();
		this.bId = bId;
		this.busName = busName;
		this.source = source;
		this.destination = destination;
		this.deparDate = deparDate;
		this.departTime = departTime;
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

	public Date getDeparDate() {
		return deparDate;
	}

	public void setDeparDate(Date deparDate) {
		this.deparDate = deparDate;
	}

	public Timestamp getDepartTime() {
		return departTime;
	}

	public void setDepartTime(Timestamp departTime) {
		this.departTime = departTime;
	}

	public Timestamp getArriveTime() {
		return arriveTime;
	}

	public void setArriveTime(Timestamp arriveTime) {
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
				+ ", deparDate=" + deparDate + ", departTime=" + departTime + ", arriveTime=" + arriveTime
				+ ", isBooked=" + isBooked + "]";
	}

	

}
