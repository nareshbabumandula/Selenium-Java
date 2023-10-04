package com.java.oops;

public class PVR extends Theatre {
	
	@Override
	public void soundSystem() {
		super.soundSystem();
		System.out.println("Dolby digital sound system is available");
	}
	
	public PVR() {
		super("IMAX");
		System.out.println("No argument constructor of an PVR class");
	}

	public static void main(String[] args) {
		PVR p = new PVR();
		p.parking();
		p.onlineTicketBooking("available");
		p.fireandSafety();
		p.emergencyExit();
		p.soundSystem();
		cafeteria();
		System.out.println(p.ticketPrice=250);
	}

	@Override
	void parking() {
		System.out.println("Parking facility is available to park 100 cars and 500 bikes");		
	}

	@Override
	void fireandSafety() {
		System.out.println("Fire and Safety precuations are taken care");
	}

	@Override
	void emergencyExit() {
		System.out.println("10 emergency exits are provided");
	}

}
