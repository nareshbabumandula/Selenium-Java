package com.exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class CheckedExceptionTest {
	
	public void checkedExceptionExample()  {
		try {
			File file = new File("./files/data.txt");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String str;
			while ((str = br.readLine())!=null) {
				System.out.println(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		CheckedExceptionTest cet = new CheckedExceptionTest();
		cet.checkedExceptionExample();

	}

}
