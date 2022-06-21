package com.morningstar.model;

public class Person {

	private int userId;
	private String title;
	private String fName;
	private String lName;
	private String emailId;
	private String password;
	private String dob;
	private long mobNo;
	private int roleId;
	
 public Person()
 {
	 
 }

 
	public int getRoleId() {
	return roleId;
}


public void setRoleId(int roleId) {
	this.roleId = roleId;
}


	public Person(int userId, String title, String fName, String lName, String emailId, String password, String dob,
		long mobNo, int roleId) {
	super();
	this.userId = userId;
	this.title = title;
	this.fName = fName;
	this.lName = lName;
	this.emailId = emailId;
	this.password = password;
	this.dob = dob;
	this.mobNo = mobNo;
	this.roleId = roleId;
}


	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public long getMobNo() {
		return mobNo;
	}
	public void setMobNo(long mobNo) {
		this.mobNo = mobNo;
	}
	@Override
	public String toString() {
		return "Person [userId=" + userId + ", title=" + title + ", fName=" + fName + ", lName=" + lName + ", emailId="
				+ emailId + ", password=" + password + ", dob=" + dob + ", mobNo=" + mobNo + "]";
	}
	
	
	
}
