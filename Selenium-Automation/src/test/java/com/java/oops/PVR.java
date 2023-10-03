package com.java.oops;

public class PVR extends Theatre {

	public static void main(String[] args) {
		PVR p = new PVR();
		p.parking();
		p.onlineTicketBooking("available");
	}

	@Override
	void parking() {
		System.out.println("Parking facility is available to park 100 cars and 500 bikes");		
	}

}
