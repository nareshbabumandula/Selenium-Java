package com.java.oops;

public class HDFC implements RBI, Bank{

    public void accountOpening() {
        System.out.println("accountOpening facility is available");
    }


    public void accountClosing() {
        System.out.println("accountClosing facility is available");
    }


    public void minDeposit() {
        System.out.println("minDeposit is 500 rupees");
    }


    public void maxDeposit() {
        System.out.println("minDeposit is 1 crore rupees with PAN CARD");
    }


    public void personalLoan() {
        System.out.println("personalLoan facility is available");
    }


    public void jointAccount() {
        System.out.println("jointAccount facility is available");
    }


    public void currentAccount() {
        System.out.println("currentAccount facility is available");
    }

    @Override
	public void KYC() {
		System.out.println("KYC is implemented for all our customers");
	}
    
    static void carLoan(){
        System.out.println("Car loan facility is available at HDFC");
    }

    
    public static void main(String[] args) {
        HDFC hd = new HDFC();
        hd.accountOpening();
        hd.minDeposit();
        hd.maxDeposit();
        hd.personalLoan();
        hd.goldloan(); // default method of an interface
        hd.jointAccount();
        hd.accountClosing();
        carLoan();
        RBI.carLoan();
        RBI.carLoan("BMW");
        hd.KYC();
        hd.loans();
        System.out.println(hd.loanAmt);
       
    }


	@Override
	public void loans() {
		System.out.println("Loans facility is provided");
		
	}

}
	
