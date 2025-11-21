package com.mphasis;

public class BankingApp {

	public static void main(String[] args) {
		  
		SavingAcc sa= new SavingAcc(3567821,"Praveen","HDFC","ICIC0000089","Mettur",123456);
		System.out.println(sa);
		sa.withDraw(500000);
		 sa.deposite(2000);
		System.out.println(sa.checkBalance());

	}

}
