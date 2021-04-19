package com.dharshini;

public class RupeePerSeat {

	static int rupeeForSeat = 0,amount;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int rupeePerseat(String userCabChoice) {
		if (userCabChoice.equalsIgnoreCase("Silver")) {
			rupeeForSeat = 100;
		}

		if (userCabChoice.equalsIgnoreCase("Gold")) {
			rupeeForSeat = 150;
		}

		if (userCabChoice.equalsIgnoreCase("Platinum")) {
			rupeeForSeat = 200;
		}
		return rupeeForSeat;
		
		// fareEstimation(rupeePerKm);
	}
		public static int fareCalc(int seats) {
			amount = rupeeForSeat * seats;
			return amount;
		//	GSTCalc.GST(amount);
		}
		
}
