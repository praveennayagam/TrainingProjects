package com.mphasis;

public class UPIPayament implements Payment {
	
	private CashPayment cash=new CashPayment();
	@Override
	public void pay(double amount) {
		System.out.println("UPI Payment Processing");
		System.out.println("user validated ");
		System.out.println("pin verification done");
		System.out.println("payment Successfull");
		cash.pay(amount);
	}

}
