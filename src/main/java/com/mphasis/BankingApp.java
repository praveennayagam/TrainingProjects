package com.mphasis;

public class BankingApp {

	public static void main(String[] args) throws InsufficientFundsException {
		  
		SavingAcc sa= new SavingAcc(3567821,"Praveen","HDFC","ICIC0000089","Mettur",123456);
		System.out.println(sa);
		sa.withDraw(500);
		 sa.deposite(2000);
		System.out.println(sa.checkBalance());

	}

}
