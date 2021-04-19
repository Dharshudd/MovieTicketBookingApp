package com.dharshini;

public class GSTCalc {
	static float gstAmount = 0,amountWithGst;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	public static float GST(){
		int gst = 7;
		RupeePerSeat f = new RupeePerSeat();
		gstAmount = (f.amount * gst) / 100;
		System.out.println("GST is 7%");
		System.out.println("GST Amount: "+gstAmount);
		amountWithGst = f.amount + gstAmount;
		return amountWithGst;
	}
}
