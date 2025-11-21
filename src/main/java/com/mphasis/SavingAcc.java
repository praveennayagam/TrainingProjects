package com.mphasis;

public class SavingAcc extends Account {

	private double balance;

	public SavingAcc(long accNo, String userName, String bankName, String iFSC, String branchName, double balance) {
		super(accNo, userName, bankName, iFSC, branchName);
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "SavingAcc [balance=" + balance + ", AccNo=" + getAccNo() + ", UserName=" + getUserName()
				+ ", BankName=" + getBankName() + ", iFSC=" + getiFSC() + ", BranchName="
				+ getBranchName() + ", Pin=" + getPin() + "]";
	}

	
	public void withDraw(double amount)
	{
		if(amount<this.balance)
		{
			this.balance=this.balance-amount;
			System.out.println("Withdraw Successfully");
		}
		else
			System.err.println("insufficient funds");
	}
	
	
	public void deposite(double amount)
	{
		this .balance=this.balance+amount;
		System.out.println("Deposite Successfully");
	}
	
		public double checkBalance() {
			return getBalance();
		}
		
		
		//code for generatepin and changepin is assignment
	
	
	

}
