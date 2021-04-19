package com.dharshini;

public class MovieTypesDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

//		System.out.println("Enter Cab Choice");
//		String userCabChoice = sc.next();
		public static void movieTypeList() {
		String [] premiumType = new String[3];
		premiumType[0]="Silver: 100rs per seat";
		premiumType[1]="Gold: 150rs per seat";
		premiumType[2]="Platinum: 200rs per seat";
		
		System.out.println("Available Premium Types");
		System.out.println("-----------------------");
		for (String c: premiumType) {
		System.out.println(c);
		}
		}
//		for(int i=0;i<3;i++) {
//			String Ctype=cabType[i];
//			System.out.println(Ctype);
//		}
		

}
