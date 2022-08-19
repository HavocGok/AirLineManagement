package com.JPA.Reservation.Dao;

import java.sql.Time;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.JPA.Reservation.Entity.DomesticAirLine;
import com.JPA.Reservation.Entity.UserReservation;
import com.JPA.Reservation.Service.DomesticService;

public class DomesticAirlineDao{
	private EntityManagerFactory emf;
	private EntityManager em;
	
	public DomesticAirlineDao() {
		emf = Persistence.createEntityManagerFactory("DomesticAirline");
		em = emf.createEntityManager();
	}
	public String UserRegistration(UserReservation ur) {
		DomesticService ds = new DomesticService();
		em.getTransaction().begin();
		em.persist(ur);
		em.getTransaction().commit();
		return "User Registration Successfully";
	}
	
	public String LoginUser(String mobileNo) {
		em.getTransaction().begin();	
		TypedQuery<UserReservation> q = em.createQuery("select u from UserReservation u",UserReservation.class);
		for(UserReservation u: q.getResultList() ) {
			if(u.getmobileNo().equals(mobileNo))
				return "Login Successfully";
		}
	
			return "INVALID MOBILE NUMBER";
		}
	
	
	public String insertFlightDetails(DomesticAirLine dm) {
	em.getTransaction().begin();
	em.persist(dm);
	em.getTransaction().commit();
	return "FLight Booked Successfully";
	}
	
	public String deleteStudent(String mobileNo) {
		em.getTransaction().begin();
		DomesticAirLine da = em.find(DomesticAirLine.class, mobileNo);
		em.remove(da);
		em.getTransaction().commit();
		return "Ticket deleted Successfully";
	}
	public String UpdateTicket(String flight_Id,String property,String value,Time ArrivalTime,Time DepartureTime,double TicketCost) {
		em.getTransaction().begin();
		DomesticAirLine dm =em.find(DomesticAirLine.class, flight_Id);
		if(property.equalsIgnoreCase("FlightName"))
		{
			dm.setName(value);
		}
		else if(property.equalsIgnoreCase("FlightSource"))
		{
			dm.setflightSource(value);
		}
		else if (property.equalsIgnoreCase("FligthDestination")) {
			dm.setflightDestination(value);
		}
		else if (property.equalsIgnoreCase("ArrivalTime")) {
			dm.setarrivalTime(ArrivalTime);
		}
		else if (property.equalsIgnoreCase("DepartureTime")) {
			dm.setdepatureTime(DepartureTime);
		}
		else if (property.equalsIgnoreCase("TicketCost")) {
			dm.getticketCost();
		}
		else if (property.equalsIgnoreCase("FromDate")) {
			dm.getFromDate();
		}
		else if (property.equalsIgnoreCase("ToDate")) {
			dm.getToDate();
		}
		return "TIcket updated Successfully";
	}
	public String insertPayment(String mobileNo) {
		em.getTransaction().begin();	
		TypedQuery<UserReservation> q = em.createQuery("select u from UserReservation u",UserReservation.class);
		for(UserReservation u: q.getResultList() ) {
			if(u.getmobileNo().equals(mobileNo))
				return "Login Successfully";
		}
	
			return "INVALID MOBILE NUMBER";
		}
}
	