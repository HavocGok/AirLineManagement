package com.JPA.Reservation.Service;

import java.util.List;

import com.JPA.Reservation.Dao.UserReservationDao;
import com.JPA.Reservation.Entity.UserReservation;

public class UserReservationService<User> {

	private UserReservationDao ur = new UserReservationDao();
	
	/*public String createTab(UserReservation u) {
		return ur.createTable(u);
	}*/
	 public String loginUser(String mobileNo) {
		return ur.loginUser(mobileNo);
	 }
	 public String getUser(UserReservation U) {
		 return ur.insertUser(U);
	 }
	 public List Flightdetails() {
		 return ur.getAllFlight();
	 }
	
}
