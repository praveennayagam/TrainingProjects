package com.mphasis;

public class Employee {

	private int empid;
	private String empname;
	private double salary;
	private String desg;
	private String dept;
	public Employee() {
		super();
		
	}
	public Employee(int empid, String empname, double salary, String desg, String dept) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
		this.desg = desg;
		this.dept = dept;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", salary=" + salary + ", desg=" + desg + ", dept="
				+ dept + "]";
	}
	
	

	
	
}
