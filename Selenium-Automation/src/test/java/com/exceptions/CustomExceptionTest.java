package com.exceptions;

public class CustomExceptionTest {
	
	void verifyDrivingLicenseEligibility(int age) throws InvalidAgeException {
		if(age<18) {
			throw new InvalidAgeException("Not Eligible for driving license since age is less than 18");
		}else {
			System.out.println("Eligible for driving license");
		}
	}

	public static void main(String[] args) throws InvalidAgeException {
		CustomExceptionTest cet = new CustomExceptionTest();
		cet.verifyDrivingLicenseEligibility(0);

	}

}
