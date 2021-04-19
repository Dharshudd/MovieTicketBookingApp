package com.dharshini;

import java.time.LocalDate;
import java.time.LocalTime;

public class MovieBookingDateAndTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	public static void movieDateMthd(String movieDate, String showTime) {
		//show date
		LocalDate currentDate = LocalDate.now();
		LocalDate movieDateObj = LocalDate.parse(movieDate);
		try {
		if(movieDateObj.isAfter(currentDate)||movieDateObj.isEqual(currentDate))
		{
			System.out.println("Movie Show Date " + movieDateObj);
		}
		}catch(Exception e){
			System.out.println("Invalid Movie Booking Date");
			System.exit(0);
		}
		// show time
		LocalTime currentTime = LocalTime.now();
		try {
		if(!showTime.equals("10:00") || !showTime.equals("02:00") || !showTime.equals("18:00") || !showTime.equals("22:30")) {
			LocalTime showTimeObj = LocalTime.parse(showTime);

		
			if(showTimeObj.isAfter(currentTime)){
				System.out.println("Movie Show Time " + showTimeObj);
				System.out.println("\n Tickets Successfully Booked! :)");
			}
			else
			{
				System.out.println("Invalid Movie Show Time");
				System.exit(0);
			}
		}
		}catch(Exception e) {
			System.out.println("Invalid Movie Show Time");
			System.out.println("\n Tickets not Booked :(");
		}
			
//		peakHourCalc(pickupTimeObj);
//		seniorCitizen(currentDate);
		
	
}
}
