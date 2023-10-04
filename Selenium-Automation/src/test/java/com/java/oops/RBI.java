package com.java.oops;

public interface RBI {
	
	double loanAmt = 1000.35; // final

    void accountOpening();
    void accountClosing();
    void minDeposit();
    void maxDeposit();
    void personalLoan();
    void jointAccount();
    void currentAccount();
    void KYC();
    void loans();

    public default void goldloan(){
        System.out.println("Gold loan facility is available..!");
    }

    static void carLoan(){
        System.out.println("Car loan facility is available");
    }

    static void carLoan(String brand){
        System.out.println("Car loan facility is available for the brand : " +brand);
    }

    public static void main(String[] args) {
       // RBI rb = new RBI();
        carLoan();
    }

}
