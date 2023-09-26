package com.java.oops;

class Employee{

	private String empName="john";
	private int empID=111;
	
	public String getEmpName() {
		return empName;
	}
	
	public void setEmpName(String empName) {
		if (empName != null && !empName.isEmpty()) {
            this.empName = empName;
        }
	}
	
	public int getEmpID() {
		return empID;
	}
	
	public void setEmpID(int empID) {
		this.empID = empID;
	}

}