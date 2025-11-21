package com.mphasis;

public class Employee {

	private String empName;
	private int empid;
	private String desg;
	private String mobileNumber;
	
	public Employee(String empName, int empid, String desg, String mobileNumber) {
		super();
		this.empName = empName;
		this.empid = empid;
		this.desg = desg;
		this.mobileNumber = mobileNumber;
	}
	
	public Employee() {
		super();
	}

	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empid=" + empid + ", desg=" + desg + ", mobileNumber=" + mobileNumber
				+ "]";
	}
 

}
