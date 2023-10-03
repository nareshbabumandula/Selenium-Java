package com.java.oops;

public class ICICI implements RBI{

	public static void main(String[] args) {
		ICICI icici = new ICICI();
		icici.KYC();

	}

	@Override
	public void KYC() {
		System.out.println("KYC is implemented at ICICI bank as per RBI guidelines..!");
	}

}
