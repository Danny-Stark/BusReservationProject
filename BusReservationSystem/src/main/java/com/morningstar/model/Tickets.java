package com.morningstar.model;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName="prototype")
public class Tickets {
	private int seatId;
	private double price;
	private String status;
	
//	@ManyToOne
//	@JoinColumn(name = "bId")
//	private Bus bus;
//
//	@ManyToOne
//	@JoinColumn(name = "userId")
//	private Customer customer;

	public Tickets(int seatId, double price, String status) {
		super();
		this.seatId = seatId;
		this.price = price;
		this.status = status;
		
	}
	
	public int getSeatId() {
		return seatId;
	}


	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Tickets [seatId=" + seatId + ", price=" + price + ", status=" + status + "]";
	}

	


}
