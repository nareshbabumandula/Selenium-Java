package com.custom.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTestcase implements IRetryAnalyzer{
	
	private int count=0;
	private static int maxretryAttempt=3;

	@Override
	public boolean retry(ITestResult result) {
		if (!result.isSuccess()) {
			if (count<maxretryAttempt) {
				count++;
				result.setStatus(ITestResult.FAILURE);
				return true;
			} else {
				result.setStatus(ITestResult.FAILURE);
			}
		} else {
			result.setStatus(ITestResult.SUCCESS);
		}
		return false;
	}

}
