package com.mphasis;

public class Account {
	private long accNo;
	private String userName;
	private String bankName;
	private String iFSC;
	private String branchName;
	private int pin;
	
	public Account() {
		super();
	}

	public Account(long accNo, String userName, String bankName, String iFSC, String branchName) {
		super();
		this.accNo = accNo;
		this.userName = userName;
		this.bankName = bankName;
		this.iFSC = iFSC;
		this.branchName = branchName;
		this.pin=generatePin();
	}

	private int generatePin() {
	
		int newPin=(int)Math.round(Math.random()*10000);
		return newPin;
	}

		
	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getiFSC() {
		return iFSC;
	}

	public void setiFSC(String iFSC) {
		this.iFSC = iFSC;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	

	public int getPin() {
		return pin;
	}

	

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", userName=" + userName + ", bankName=" + bankName + ", iFSC=" + iFSC
				+ ", branchName=" + branchName + ", pin=" + pin + "]";
	}
	
	public void withDraw (double amount) throws InsufficientFundsException
	{
		System.out.println("Account withdraw");
		
	}
	public void deposite(double amount)
	{
		System.out.println("Acoount Deposite");
	}

	
	
	
	
	
	

}
