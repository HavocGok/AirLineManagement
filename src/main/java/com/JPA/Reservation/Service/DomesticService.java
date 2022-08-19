package com.JPA.Reservation.Service;
import java.sql.Time;

import com.JPA.Reservation.Dao.DomesticAirlineDao;
import com.JPA.Reservation.Entity.DomesticAirLine;
import com.JPA.Reservation.Entity.UserReservation;

public class DomesticService {
	private DomesticAirlineDao dado = new DomesticAirlineDao();
	
	//public String FlightDetails() {
		//return dado.getallFlights();
	//}
	//public String bookFlight() {
	//	return dado.insertFlightDetails(dado);
	//}
	
	/*public String viewDomesticAirline() {
		return dado.getallFlights();
	}
	public void viewAllFlights() {s
		System.out.println(dado.viewAllFlights());*/
	public String addUser(UserReservation ur) {
		return dado.UserRegistration(ur);
	}
	public String userLogin(String mobileNo) {
		return dado.LoginUser(mobileNo);
	}
	public String bookFlight(DomesticAirLine dm) {
		return dado.insertFlightDetails(dm);
		
	}
	public String Cancellation(String mobileNo) {
		return dado.deleteStudent(mobileNo);
	}
	public String UpdateBooking(String flight_Id,String property,String value,Time arrivalTime,Time departureTime,double ticketCost) {
		return dado.UpdateTicket(flight_Id,property,value,arrivalTime,departureTime,ticketCost);
	}
	}
	
	
		
	

