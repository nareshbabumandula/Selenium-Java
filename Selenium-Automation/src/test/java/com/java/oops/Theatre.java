package com.java.oops;

public abstract class Theatre {
	
	int ticketPrice=200;
	
	// non abstract or non-static or concrete java method
	void onlineTicketBooking(String onlineFacility) {
		// method body or implementation
		System.out.println("Online ticket booking facility is " + onlineFacility);
	}
	
	//abstract or unimplemented method
	abstract void parking();
	abstract void fireandSafety();
	abstract void emergencyExit();
	
	public void soundSystem() {
		System.out.println("Dolby digital sound system of Theatre class");
	}
		
	static void cafeteria() {
		System.out.println("Cafeteria facility is available..!");
	}
	
	public Theatre() {
		System.out.println("No argument constructor of an abstract class Theatre");
	}
	
	public Theatre(String name) {
		System.out.println("Parameterized constructor of an abstract class Theatre with name : " + name);
	}


	public static void main(String[] args) {
		//Theatre theatre = new Theatre(); // We can't instantiate the type Theatre
		cafeteria();

	}

}
