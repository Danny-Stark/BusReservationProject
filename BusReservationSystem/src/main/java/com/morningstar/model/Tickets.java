package com.morningstar.model;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName="prototype")
public class Tickets {
	private int sId;
	private int bId;
	private int pId;
	private double price;
	private String status;
	
	

//	@ManyToOne
//	@JoinColumn(name = "bId")
	//private Bus bus;


	

	public Tickets() {
	}


	public Tickets(int sId, int bId, int pId, double price, String status) {
		super();
		this.sId = sId;
		this.bId = bId;
		this.pId = pId;
		this.price = price;
		this.status = status;
		
	}

	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public int getbId() {
		return bId;
	}

	public void setbId(int bId) {
		this.bId = bId;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Tickets [sId=" + sId + ", bId=" + bId + ", pId=" + pId + ", status=" + status + "]";
	}

}
