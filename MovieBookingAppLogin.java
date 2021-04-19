package com.dharshini;

public class MovieBookingAppLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	public static boolean logIn(long MobileNo, String password) {
		boolean valid = false;
		try {
			String mobStr = String.valueOf(MobileNo);
			if (mobStr.length() == 10 && password.length() >= 8) {
				valid = true;
			}

		} catch (NumberFormatException e) {
			valid = false;
		}

		return valid;
	}
}