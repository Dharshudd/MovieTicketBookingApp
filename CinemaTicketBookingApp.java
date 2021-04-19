package com.dharshini;

import java.util.Scanner;

//Main Class
public class CinemaTicketBookingApp {

	public static void main(String[] args) {
		// input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter MobileNo");
		long MobileNo = sc.nextLong();
		System.out.println("Enter Password");
		String password = sc.next();

		// Logic and output
		if (MovieBookingAppLogin.logIn(MobileNo, password) == true) {
			System.out.println("Successfully Loggedin!\n");
		} else {
			System.out.println("Invalid Mobile No. Or Password");
			System.exit(0);
		}

		// input
		System.out.println("Enter your Movie Premium Choice");
		MovieTypesDisplay.movieTypeList();
		String userMoviePremiumChoice = sc.next();

		// Logic and output
		if (userMoviePremiumChoice.equalsIgnoreCase("Silver") || userMoviePremiumChoice.equalsIgnoreCase("Gold")
				|| userMoviePremiumChoice.equalsIgnoreCase("Platinum")) {
			RupeePerSeat.rupeePerseat(userMoviePremiumChoice);
			System.out.println("Enter No of seats to be booked");
			int seats = sc.nextInt();
			RupeePerSeat.fareCalc(seats);
			// RupeePerSeat f = new RupeePerSeat();
			System.out.println("Your booking amount for " + userMoviePremiumChoice + " is " + RupeePerSeat.amount);
		} else {
			System.out.println("Invalid Premium Choice");
			System.exit(0);
		}

		// GST LOGIC
		GSTCalc.GST();
		// GSTCalc g = new GSTCalc();
		System.out.println("Your Booking amount with GST is " + GSTCalc.amountWithGst);

		// Input
		System.out.println("Enter Movie Booking Date");
		String movieDate = sc.next();

		System.out.println("Enter Show Time");
		System.out.println("Show Timings");
		System.out.println("------------");
		System.out.println("10:00");
		System.out.println("02:00");
		System.out.println("18:00");
		System.out.println("22:30");

		String showTime = sc.next();

		// Logic and Output
		MovieBookingDateAndTime.movieDateMthd(movieDate, showTime);
		

	}
}