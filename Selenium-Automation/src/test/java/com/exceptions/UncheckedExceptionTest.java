package com.exceptions;

public class UncheckedExceptionTest {
	
	void uncheckedExceptionExample(){
		int a=10;
		int b=0;
		boolean bFlag = false;
		String errMsg="";
		try {
			int score[] = new int[4];
			score[0]=90;
			score[1]=80;
			score[2]=60;
			score[3]=95;
			System.out.println(score.length);
			System.out.println(score[0]);
			System.out.println(score[4]); // ArrayIndexOutOfBoundsException
			String str = null;
			System.out.println(str.length());  // NullPointerException
			String s = "hello";
			int i = Integer.parseInt(s); // NumberFormatExpection
	    	int c=a/b; // ArithmeticException: / by zero
			System.out.println("Division of a and b is : " + c);
			int d=a*b;
			System.out.println("Multiplication of a and b is : " + d);
			bFlag=true;
		}catch (ArithmeticException e) {
			System.out.println("Executing the catch block of Arithmatic exception");
		}catch (RuntimeException e) {
			errMsg=e.getMessage();
			e.printStackTrace();
			int d=b%a;
			System.out.println("Modulus of a and b is : " + d);
		} 
		
		finally {
			if (bFlag) {
				System.out.println("Successfully performed all the arithmatic operations");
			} else {
				System.out.println("Failed to perform all the arithmatic operations since - " + errMsg);
			}
		}
	}


	public static void main(String[] args) {
		UncheckedExceptionTest uct = new UncheckedExceptionTest();
		uct.uncheckedExceptionExample();

	}

}
