//package com.morningstar.dao;
//
//import java.sql.Date;
//import java.sql.Timestamp;
//import java.util.List;
//
//import com.morningstar.model.Flight;
//import com.morningstar.model.Person;
//import com.morningstar.model.Tickets;
//
//public interface BusReservationDao {
//
//	public int addPerson(Person p);//2register
//	public int addFlight(Flight p);//dual insert insert flight insert 10 record into tickets pid
//	public Person getUserInfo(int id);//2//common
//	public List<Flight> getAllFlights();
//	public List<Flight> getFlightSourceAndDestination(String source,String destination);//single flight info where destination is given
//	public List<Flight> getFlightBetweenTime(Timestamp departTime,Timestamp arriveTime);//1Flights list between given time
//	public List<Flight> getFlightForDate(Date date);//1
//	public List<Tickets> getUserTicketInfo(int id);//list of users tickets by passing userId
//	public List<Tickets> getFlightTicketInfo(int id);//list of Flight tickets by passing flightId//doubt
//	public int removeFlight(int id);
//	public int cancelTickets(int fId,int sId);
//	public int booktickets(int fId,int sID);//1status of seats booked or not
//	public List<Person> getAllUsers();//
//	List<Flight> getAllFlightInfo();
//
//	//user-register-login-logout = 2
//	//home+login+userinfo(admin / user)+Admin(addFlight/removeFlight/getAllUsers/getAllFlights/SeeAllTickets)
//	//+User(searchFlight-search-by-date,time,place/bookSeats/seeUserTickts/cancelTickets
//    //addFlight+removeFlight+cancelTickets+booktickets = 2
//	//getUserInfo+getAllFlightInfo+getUserTicketInfo+getFlightTicketInfo = 1
//	//getFlightSourceAndDestination+getFlightBetweenTime+getFlightForDate+getAllUsers = 2
//}
