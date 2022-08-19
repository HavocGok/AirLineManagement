package com.JPA.Reservation;

import java.sql.Date;
import java.sql.Time;
import java.util.Scanner;

import com.JPA.Reservation.Entity.DomesticAirLine;
import com.JPA.Reservation.Entity.UserReservation;
import com.JPA.Reservation.Service.Account_Service;
import com.JPA.Reservation.Service.DomesticService;
import com.JPA.Reservation.Service.UserReservationService;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Welcome The AIRLINE-RESERVATION MANAGEMENT SYSTEM");
		System.out.println();
		System.out.println("What You Looking For?");
		System.out.println();
		System.out.println("1. Domestic Airline \n2. International Airline");
		System.out.println();
		System.out.println("Give your choice :");
		int choice = s.nextInt();
		char ch;
		while (choice == 1 || choice == 2) {

			System.out.println();

			System.out.println("Domestic Airlines -->");
			System.out.println("******** FlightDetails *********");

			UserReservationService urs = new UserReservationService();
			DomesticService ds = new DomesticService();
			// System.out.println(ds.FlightDetails());
			System.out.println("%%%%%%%%%%%%%%%%%%");
			switch (choice) {

			case 1:
				ch = 'C';
				while (ch == 'C') {
					System.out.println();
					// System.out.println(ds.viewDomesticAirline());
					System.out.println(
							"1. UserRegistration \n2. Login \n3. Book a Ticket \n4. Cancel a Ticket \n5. Update Flight details \n6. Inventory  \n7. fares \n8. Transcation.");
					System.out.println("Enter the option :");
					System.out.println();
					int option = s.nextInt();
					String flightName, flight_Id, fligthSource, flightDestination;
					Time arrivalTime, departureTime;
					Date fromDate, toDate;
					String name, passportNo, eMail, nationality;
					String mobileNo, address;
					int cus_Id, age;
					double ticketCost;
					switch (option) {

					case 1:
						System.out.println("User Registration :");
						System.out.println();
						Scanner sc = new Scanner(System.in);
						System.out.println("Enter Your Name :");
						name = sc.next();
						System.out.println("Enter Your cus_Id :");
						cus_Id = sc.nextInt();
						System.out.println("Enter Your Age :");
						age = sc.nextInt();
						System.out.println("Enter your MobileNo :");
						mobileNo = sc.next();
						System.out.println("Enter Your Address :");
						address = sc.next();
						System.out.println("Enter your E-Mail Id :");
						eMail = sc.next();
						System.out.println("Enter your PassPort Number :");
						passportNo = sc.next();
						System.out.println("Enter your Nationality :");
						nationality = sc.next();
						System.out.println();
						UserReservation u = new UserReservation(name, cus_Id, age, mobileNo, address, eMail, passportNo,
								nationality);
						System.out.println(ds.addUser(u));
						System.out.println();
						System.out.println("Now! You need to Login...");
						break;

					case 2:
						System.out.println("Login");
						System.out.println();
						System.out.println("Enter your MobileNo :");
						mobileNo = s.next();
						System.out.println(ds.userLogin(mobileNo));
						System.out.println();
						System.out.println("");
						break;
					case 3:
						System.out.println("Book flight");
						System.out.println();
						System.out.println("Enter Your FlightName :");
						flightName = s.next();
						System.out.println("Enter Your Flight_id :");
						flight_Id = s.next();
						System.out.println("Enter Your FlightSource :");
						fligthSource = s.next();
						System.out.println("Enter Your FlightDestination :");
						flightDestination = s.next();
						System.out.println("Enter Your ArrivalTime :");
						arrivalTime = Time.valueOf(s.next());
						System.out.println("Enter Your DepartureTime :");
						departureTime = Time.valueOf(s.next());
						System.out.println("Enter Your TicketCost :");
						ticketCost = s.nextDouble();
						System.out.println("Enter Your FromDate :");
						fromDate = Date.valueOf(s.next());
						System.out.println("Enter Your ToDate :");
						toDate = Date.valueOf(s.next());
						System.out.println();
						DomesticAirLine da = new DomesticAirLine(flightName, flight_Id, fligthSource, flightDestination,
								arrivalTime, departureTime, ticketCost, fromDate, toDate);
						System.out.println();
						System.out.println(ds.bookFlight(da));

						break;
					case 4:
						System.out.println("Cancellation");
						System.out.println();
						System.out.println("Enter the MobileNo :");
						mobileNo = s.next();
						System.out.println(ds.Cancellation(mobileNo));
						break;
					case 5:
						System.out.println("Update Ticket Details --->");
						System.out.println();
						System.out.println("Enter Your FlightName :");
						flightName = s.next();
						System.out.println("Enter Your FlightSource :");
						fligthSource = s.next();
						System.out.println("Enter Your FlightDestination :");
						flightDestination = s.next();
						System.out.println("Enter Your ArrivalTime :");
						arrivalTime = Time.valueOf(s.next());
						System.out.println("Enter Your DepartureTime :");
						departureTime = Time.valueOf(s.next());
						System.out.println("Enter Your TicketCost :");
						ticketCost = s.nextDouble();
						System.out.println("Enter Your FromDate :");
						fromDate = Date.valueOf(s.next());
						System.out.println("Enter Your ToDate :");
						toDate = Date.valueOf(s.next());
						System.out.println();
						System.out.println(ds.UpdateBooking(flightName, fligthSource, flightDestination, arrivalTime,
								departureTime, ticketCost));
						System.out.println();
						break;
					case 6:
						System.out.println("Inventory");
						System.out.println("We are providing many service on this Inventory Operation.");
						ch = 'C';
						while (ch == 'C') {
							System.out.println(
									"1. Available Seats \n2. Luggages \n3. Life Jackets \n4. Medical Emergency \n5. Foods ");
							System.out.println();
							System.out.println("Enter the option :");
							System.out.println();
							switch (choice) {
							case 1:
								System.out.println("Available Seats :");
								System.out.println();
								System.out.println("Totally 130 Seats are available!!!");
								System.out.println();
								System.out.println("        1.First seats = 30");
								System.out.println("        2.Premium seats = 20");
								System.out.println("        3.Bussiness seats = 30");
								System.out.println("        4.Economy seats = 60");
								break;
							case 2:
								System.out.println("Luggages :");
								System.out.println();
								System.out.println(
										"The bags are loosely loaded on the floor of the cargo compartment/cargo hold on narrow-body aircraft or small to medium aircraft");
								System.out.println(
										"On large or wide-body aircraft, bags are stored on containers or ULDs which are loaded as units using deck loaders.");
								break;
							case 3:
								System.out.println("Life Jackets :");
								System.out.println(
										"Emergency safety item for aircraft passengers to be available on all air transport for all persons aboard.");
								System.out.println(
										"Automatic inflatable 2 cells floating vest, with CO2 and oral inflation system.");
								System.out.println(
										"Equipped with a light. 5 to 10 years shelf life depending on the type of package.");
								break;
							case 4:
								System.out.println("Medical Emergency");
								System.out.println();
								System.out.println("The most common emergencies involved:\r\n"
										+ "Lightheadedness or fainting (37.4% of emergencies);\r\n"
										+ "Respiratory problems (12.1%);\r\n" + "Nausea or vomiting (9.5%);\r\n"
										+ "Cardiac symptoms (7.7%); and.\r\n" + "Seizures (5.8%).");
								System.out.println(
										"In-flight medical emergencies most commonly involve near-syncope and gastrointestinal, respiratory, and cardiovascular symptoms.");
								break;
							}
						}
					case 7:
						
					case 8:
						
						System.out.println("------>>Transcation Management<<------");
						char ch1 = 'Y';
						Scanner sc1 = new Scanner(System.in);
						Account_Service accms = new Account_Service();
						int AccountNo;
						String AccName, mobileNo1, DOB;
						double balance;

						while (ch1 == 'Y') {
							System.out.println(
									"1. Insert Account Details \n2. View Account Details \n3. Update Account Details \n4. Delete Account \n5. Credit\n8. Exit");
							int option1 = sc1.nextInt();
							switch (option1) {
							case 1:
								System.out.println("Insert Account Details :");
								System.out.println("Enter Account No :-->");
								AccountNo = sc1.nextInt();
								System.out.println("Enter Account Name :-->");
								AccName = sc1.next();
								System.out.println("Enter Mobile Number :-->");
								mobileNo = sc1.next();
								System.out.println("Enter Employee DOB :-->");
								DOB = sc1.next();
								if (accms.insertAccount(AccountNo, AccName, mobileNo, 0, DOB)) {
									System.out.println("********Account Added Successfully...********");
								} else {
									System.out.println("------Something Wrong------");
								}
								break;
							case 2:
								System.out.println("View Account Details..");
								System.out.println("Enter Account No :-->");
								AccountNo = sc1.nextInt();
								accms.viewAccount(AccountNo);
								break;
							case 3:
								System.out.println("Update Account Details :");
								System.out.println("Enter Account No :-->");
								AccountNo = sc1.nextInt();
								System.out.println("Enter Account Name :-->");
								AccName = sc1.next();
								System.out.println("Enter Mobile Number :-->");
								mobileNo = sc1.next();
								System.out.println("Enter Employee DOB :-->");
								DOB = sc1.next();
								if (accms.updateAccountDetails(AccountNo, AccName, mobileNo, DOB)) {
									System.out.println("********Account Updated Successfully...********");
								} else {
									System.out.println("------Something Wrong------");
								}
								break;
							case 4:
								System.out.println("Delete Account");
								System.out.println("Enter Account No :-->");
								AccountNo = sc1.nextInt();
								if (accms.deleteAccount(AccountNo)) {
									System.out.println("********Account Deleted Successfully...********");
								} else {
									System.out.println("------Something Wrong------");
								}
								break;
							
							case 5:
								System.out.println("Credit the amount");
								System.out.println("Enter Account No :-->");
								AccountNo = sc1.nextInt();
								System.out.println("Enter the amount to be credited: ");
								double camt = sc1.nextDouble();
								if (accms.creditAccount(AccountNo, camt)) {
									System.out.println("Successfully Credited...");
								} else {
									System.out.println("Transaction Failure");
								}
								break;
							
							default:
								System.out.println("Thank You...");
								break;
							}
							System.out.println("You want To Continue(Press Y)");
							ch1 = sc1.next().charAt(0);
							break;
						}
						default:
							break;
					}
				}
			}
		}
	}
}
