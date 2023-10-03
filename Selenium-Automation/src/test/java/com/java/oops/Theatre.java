package com.java.oops;

public abstract class Theatre {
	
	void onlineTicketBooking(String onlineFacility) {
		// method body or implementation
		System.out.println("Online ticket booking facility is " + onlineFacility);
	}
	
	//abstract or unimplemented method
	abstract void parking();


	public static void main(String[] args) {
		//Theatre theatre = new Theatre(); // We can't instantiate the type Theatre
		

	}

}
