package com.morningstar.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.OneToMany;

public class Passengers {
private int pId;
private int bId;
private int sId;

//@OneToMany(mappedBy="sId")
//private List<Tickets> tickets=new ArrayList<>();

public Passengers(int pId, int bId, int sId) {
	super();
	this.pId = pId;
	this.bId = bId;
	this.sId = sId;
}
public int getpId() {
	return pId;
}
public void setpId(int pId) {
	this.pId = pId;
}
public int getbId() {
	return bId;
}
public void setbId(int bId) {
	this.bId = bId;
}
public int getsId() {
	return sId;
}
public void setsId(int sId) {
	this.sId = sId;
}
@Override
public String toString() {
	return "Passengers [pId=" + pId + ", bId=" + bId + ", sId=" + sId + "]";
}
	

}
