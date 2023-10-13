package com.custom.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener implements ITestListener{
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test case started - " + result.getName());
	}
	
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test execution completed - " + context.getName());
	}
}
